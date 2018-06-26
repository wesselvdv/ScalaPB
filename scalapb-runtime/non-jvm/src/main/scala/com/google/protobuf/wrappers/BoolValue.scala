// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package com.google.protobuf.wrappers

/** Wrapper message for `bool`.
  *
  * The JSON representation for `BoolValue` is JSON `true` and `false`.
  *
  * @param value
  *   The bool value.
  */
@SerialVersionUID(0L)
final case class BoolValue(
    value: _root_.scala.Boolean = false
    ) extends scalapb.GeneratedMessage with scalapb.Message[BoolValue] with scalapb.lenses.Updatable[BoolValue] {
    @transient
    private[this] var __serializedSizeCachedValue: _root_.scala.Int = 0
    private[this] def __computeSerializedValue(): _root_.scala.Int = {
      var __size = 0
      
      {
        val __value = value
        if (__value != false) {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeBoolSize(1, __value)
        }
      };
      __size
    }
    final override def serializedSize: _root_.scala.Int = {
      var read = __serializedSizeCachedValue
      if (read == 0) {
        read = __computeSerializedValue()
        __serializedSizeCachedValue = read
      }
      read
    }
    def writeTo(`_output__`: _root_.com.google.protobuf.CodedOutputStream): _root_.scala.Unit = {
      {
        val __v = value
        if (__v != false) {
          _output__.writeBool(1, __v)
        }
      };
    }
    def mergeFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): com.google.protobuf.wrappers.BoolValue = {
      var __value = this.value
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 8 =>
            __value = _input__.readBool()
          case tag => _input__.skipField(tag)
        }
      }
      com.google.protobuf.wrappers.BoolValue(
          value = __value
      )
    }
    def withValue(__v: _root_.scala.Boolean): BoolValue = copy(value = __v)
    def getFieldByNumber(__fieldNumber: _root_.scala.Int): _root_.scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => {
          val __t = value
          if (__t != false) __t else null
        }
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      _root_.scala.Predef.require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => _root_.scalapb.descriptors.PBoolean(value)
      }
    }
    def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
    def companion = com.google.protobuf.wrappers.BoolValue
}

object BoolValue extends scalapb.GeneratedMessageCompanion[com.google.protobuf.wrappers.BoolValue] {
  implicit def messageCompanion: scalapb.GeneratedMessageCompanion[com.google.protobuf.wrappers.BoolValue] = this
  def fromFieldsMap(__fieldsMap: scala.collection.immutable.Map[_root_.com.google.protobuf.Descriptors.FieldDescriptor, _root_.scala.Any]): com.google.protobuf.wrappers.BoolValue = {
    _root_.scala.Predef.require(__fieldsMap.keys.forall(_.getContainingType() == javaDescriptor), "FieldDescriptor does not match message type.")
    val __fields = javaDescriptor.getFields
    com.google.protobuf.wrappers.BoolValue(
      __fieldsMap.getOrElse(__fields.get(0), false).asInstanceOf[_root_.scala.Boolean]
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[com.google.protobuf.wrappers.BoolValue] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      _root_.scala.Predef.require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
      com.google.protobuf.wrappers.BoolValue(
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).map(_.as[_root_.scala.Boolean]).getOrElse(false)
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = WrappersProto.javaDescriptor.getMessageTypes.get(6)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = WrappersProto.scalaDescriptor.messages(6)
  def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = throw new MatchError(__number)
  lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_]] = Seq.empty
  def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
  lazy val defaultInstance = com.google.protobuf.wrappers.BoolValue(
  )
  implicit class BoolValueLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, com.google.protobuf.wrappers.BoolValue]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, com.google.protobuf.wrappers.BoolValue](_l) {
    def value: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Boolean] = field(_.value)((c_, f_) => c_.copy(value = f_))
  }
  final val VALUE_FIELD_NUMBER = 1
}
