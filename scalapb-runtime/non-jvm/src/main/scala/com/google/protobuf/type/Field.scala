// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package com.google.protobuf.`type`

/** A single field of a message type.
  *
  * @param kind
  *   The field type.
  * @param cardinality
  *   The field cardinality.
  * @param number
  *   The field number.
  * @param name
  *   The field name.
  * @param typeUrl
  *   The field type URL, without the scheme, for message or enumeration
  *   types. Example: `"type.googleapis.com/google.protobuf.Timestamp"`.
  * @param oneofIndex
  *   The index of the field type in `Type.oneofs`, for message or enumeration
  *   types. The first type has index 1; zero means the type is not in the list.
  * @param packed
  *   Whether to use alternative packed wire representation.
  * @param options
  *   The protocol buffer options.
  * @param jsonName
  *   The field JSON name.
  * @param defaultValue
  *   The string value of the default value of this field. Proto2 syntax only.
  */
@SerialVersionUID(0L)
final case class Field(
    kind: com.google.protobuf.`type`.Field.Kind = com.google.protobuf.`type`.Field.Kind.TYPE_UNKNOWN,
    cardinality: com.google.protobuf.`type`.Field.Cardinality = com.google.protobuf.`type`.Field.Cardinality.CARDINALITY_UNKNOWN,
    number: _root_.scala.Int = 0,
    name: _root_.scala.Predef.String = "",
    typeUrl: _root_.scala.Predef.String = "",
    oneofIndex: _root_.scala.Int = 0,
    packed: _root_.scala.Boolean = false,
    options: _root_.scala.collection.Seq[com.google.protobuf.`type`.OptionProto] = _root_.scala.collection.Seq.empty,
    jsonName: _root_.scala.Predef.String = "",
    defaultValue: _root_.scala.Predef.String = ""
    ) extends scalapb.GeneratedMessage with scalapb.Message[Field] with scalapb.lenses.Updatable[Field] {
    @transient
    private[this] var __serializedSizeCachedValue: _root_.scala.Int = 0
    private[this] def __computeSerializedValue(): _root_.scala.Int = {
      var __size = 0
      
      {
        val __value = kind
        if (__value != com.google.protobuf.`type`.Field.Kind.TYPE_UNKNOWN) {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeEnumSize(1, __value.value)
        }
      };
      
      {
        val __value = cardinality
        if (__value != com.google.protobuf.`type`.Field.Cardinality.CARDINALITY_UNKNOWN) {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeEnumSize(2, __value.value)
        }
      };
      
      {
        val __value = number
        if (__value != 0) {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeInt32Size(3, __value)
        }
      };
      
      {
        val __value = name
        if (__value != "") {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(4, __value)
        }
      };
      
      {
        val __value = typeUrl
        if (__value != "") {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(6, __value)
        }
      };
      
      {
        val __value = oneofIndex
        if (__value != 0) {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeInt32Size(7, __value)
        }
      };
      
      {
        val __value = packed
        if (__value != false) {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeBoolSize(8, __value)
        }
      };
      options.foreach { __item =>
        val __value = __item
        __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(__value.serializedSize) + __value.serializedSize
      }
      
      {
        val __value = jsonName
        if (__value != "") {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(10, __value)
        }
      };
      
      {
        val __value = defaultValue
        if (__value != "") {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(11, __value)
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
        val __v = kind
        if (__v != com.google.protobuf.`type`.Field.Kind.TYPE_UNKNOWN) {
          _output__.writeEnum(1, __v.value)
        }
      };
      {
        val __v = cardinality
        if (__v != com.google.protobuf.`type`.Field.Cardinality.CARDINALITY_UNKNOWN) {
          _output__.writeEnum(2, __v.value)
        }
      };
      {
        val __v = number
        if (__v != 0) {
          _output__.writeInt32(3, __v)
        }
      };
      {
        val __v = name
        if (__v != "") {
          _output__.writeString(4, __v)
        }
      };
      {
        val __v = typeUrl
        if (__v != "") {
          _output__.writeString(6, __v)
        }
      };
      {
        val __v = oneofIndex
        if (__v != 0) {
          _output__.writeInt32(7, __v)
        }
      };
      {
        val __v = packed
        if (__v != false) {
          _output__.writeBool(8, __v)
        }
      };
      options.foreach { __v =>
        val __m = __v
        _output__.writeTag(9, 2)
        _output__.writeUInt32NoTag(__m.serializedSize)
        __m.writeTo(_output__)
      };
      {
        val __v = jsonName
        if (__v != "") {
          _output__.writeString(10, __v)
        }
      };
      {
        val __v = defaultValue
        if (__v != "") {
          _output__.writeString(11, __v)
        }
      };
    }
    def mergeFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): com.google.protobuf.`type`.Field = {
      var __kind = this.kind
      var __cardinality = this.cardinality
      var __number = this.number
      var __name = this.name
      var __typeUrl = this.typeUrl
      var __oneofIndex = this.oneofIndex
      var __packed = this.packed
      val __options = (_root_.scala.collection.immutable.Vector.newBuilder[com.google.protobuf.`type`.OptionProto] ++= this.options)
      var __jsonName = this.jsonName
      var __defaultValue = this.defaultValue
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 8 =>
            __kind = com.google.protobuf.`type`.Field.Kind.fromValue(_input__.readEnum())
          case 16 =>
            __cardinality = com.google.protobuf.`type`.Field.Cardinality.fromValue(_input__.readEnum())
          case 24 =>
            __number = _input__.readInt32()
          case 34 =>
            __name = _input__.readString()
          case 50 =>
            __typeUrl = _input__.readString()
          case 56 =>
            __oneofIndex = _input__.readInt32()
          case 64 =>
            __packed = _input__.readBool()
          case 74 =>
            __options += _root_.scalapb.LiteParser.readMessage(_input__, com.google.protobuf.`type`.OptionProto.defaultInstance)
          case 82 =>
            __jsonName = _input__.readString()
          case 90 =>
            __defaultValue = _input__.readString()
          case tag => _input__.skipField(tag)
        }
      }
      com.google.protobuf.`type`.Field(
          kind = __kind,
          cardinality = __cardinality,
          number = __number,
          name = __name,
          typeUrl = __typeUrl,
          oneofIndex = __oneofIndex,
          packed = __packed,
          options = __options.result(),
          jsonName = __jsonName,
          defaultValue = __defaultValue
      )
    }
    def withKind(__v: com.google.protobuf.`type`.Field.Kind): Field = copy(kind = __v)
    def withCardinality(__v: com.google.protobuf.`type`.Field.Cardinality): Field = copy(cardinality = __v)
    def withNumber(__v: _root_.scala.Int): Field = copy(number = __v)
    def withName(__v: _root_.scala.Predef.String): Field = copy(name = __v)
    def withTypeUrl(__v: _root_.scala.Predef.String): Field = copy(typeUrl = __v)
    def withOneofIndex(__v: _root_.scala.Int): Field = copy(oneofIndex = __v)
    def withPacked(__v: _root_.scala.Boolean): Field = copy(packed = __v)
    def clearOptions = copy(options = _root_.scala.collection.Seq.empty)
    def addOptions(__vs: com.google.protobuf.`type`.OptionProto*): Field = addAllOptions(__vs)
    def addAllOptions(__vs: TraversableOnce[com.google.protobuf.`type`.OptionProto]): Field = copy(options = options ++ __vs)
    def withOptions(__v: _root_.scala.collection.Seq[com.google.protobuf.`type`.OptionProto]): Field = copy(options = __v)
    def withJsonName(__v: _root_.scala.Predef.String): Field = copy(jsonName = __v)
    def withDefaultValue(__v: _root_.scala.Predef.String): Field = copy(defaultValue = __v)
    def getFieldByNumber(__fieldNumber: _root_.scala.Int): _root_.scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => {
          val __t = kind.javaValueDescriptor
          if (__t.getNumber() != 0) __t else null
        }
        case 2 => {
          val __t = cardinality.javaValueDescriptor
          if (__t.getNumber() != 0) __t else null
        }
        case 3 => {
          val __t = number
          if (__t != 0) __t else null
        }
        case 4 => {
          val __t = name
          if (__t != "") __t else null
        }
        case 6 => {
          val __t = typeUrl
          if (__t != "") __t else null
        }
        case 7 => {
          val __t = oneofIndex
          if (__t != 0) __t else null
        }
        case 8 => {
          val __t = packed
          if (__t != false) __t else null
        }
        case 9 => options
        case 10 => {
          val __t = jsonName
          if (__t != "") __t else null
        }
        case 11 => {
          val __t = defaultValue
          if (__t != "") __t else null
        }
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      _root_.scala.Predef.require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => _root_.scalapb.descriptors.PEnum(kind.scalaValueDescriptor)
        case 2 => _root_.scalapb.descriptors.PEnum(cardinality.scalaValueDescriptor)
        case 3 => _root_.scalapb.descriptors.PInt(number)
        case 4 => _root_.scalapb.descriptors.PString(name)
        case 6 => _root_.scalapb.descriptors.PString(typeUrl)
        case 7 => _root_.scalapb.descriptors.PInt(oneofIndex)
        case 8 => _root_.scalapb.descriptors.PBoolean(packed)
        case 9 => _root_.scalapb.descriptors.PRepeated(options.map(_.toPMessage)(_root_.scala.collection.breakOut))
        case 10 => _root_.scalapb.descriptors.PString(jsonName)
        case 11 => _root_.scalapb.descriptors.PString(defaultValue)
      }
    }
    def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
    def companion = com.google.protobuf.`type`.Field
}

object Field extends scalapb.GeneratedMessageCompanion[com.google.protobuf.`type`.Field] {
  implicit def messageCompanion: scalapb.GeneratedMessageCompanion[com.google.protobuf.`type`.Field] = this
  def fromFieldsMap(__fieldsMap: scala.collection.immutable.Map[_root_.com.google.protobuf.Descriptors.FieldDescriptor, _root_.scala.Any]): com.google.protobuf.`type`.Field = {
    _root_.scala.Predef.require(__fieldsMap.keys.forall(_.getContainingType() == javaDescriptor), "FieldDescriptor does not match message type.")
    val __fields = javaDescriptor.getFields
    com.google.protobuf.`type`.Field(
      com.google.protobuf.`type`.Field.Kind.fromValue(__fieldsMap.getOrElse(__fields.get(0), com.google.protobuf.`type`.Field.Kind.TYPE_UNKNOWN.javaValueDescriptor).asInstanceOf[_root_.com.google.protobuf.Descriptors.EnumValueDescriptor].getNumber),
      com.google.protobuf.`type`.Field.Cardinality.fromValue(__fieldsMap.getOrElse(__fields.get(1), com.google.protobuf.`type`.Field.Cardinality.CARDINALITY_UNKNOWN.javaValueDescriptor).asInstanceOf[_root_.com.google.protobuf.Descriptors.EnumValueDescriptor].getNumber),
      __fieldsMap.getOrElse(__fields.get(2), 0).asInstanceOf[_root_.scala.Int],
      __fieldsMap.getOrElse(__fields.get(3), "").asInstanceOf[_root_.scala.Predef.String],
      __fieldsMap.getOrElse(__fields.get(4), "").asInstanceOf[_root_.scala.Predef.String],
      __fieldsMap.getOrElse(__fields.get(5), 0).asInstanceOf[_root_.scala.Int],
      __fieldsMap.getOrElse(__fields.get(6), false).asInstanceOf[_root_.scala.Boolean],
      __fieldsMap.getOrElse(__fields.get(7), Nil).asInstanceOf[_root_.scala.collection.Seq[com.google.protobuf.`type`.OptionProto]],
      __fieldsMap.getOrElse(__fields.get(8), "").asInstanceOf[_root_.scala.Predef.String],
      __fieldsMap.getOrElse(__fields.get(9), "").asInstanceOf[_root_.scala.Predef.String]
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[com.google.protobuf.`type`.Field] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      _root_.scala.Predef.require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
      com.google.protobuf.`type`.Field(
        com.google.protobuf.`type`.Field.Kind.fromValue(__fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).map(_.as[_root_.scalapb.descriptors.EnumValueDescriptor]).getOrElse(com.google.protobuf.`type`.Field.Kind.TYPE_UNKNOWN.scalaValueDescriptor).number),
        com.google.protobuf.`type`.Field.Cardinality.fromValue(__fieldsMap.get(scalaDescriptor.findFieldByNumber(2).get).map(_.as[_root_.scalapb.descriptors.EnumValueDescriptor]).getOrElse(com.google.protobuf.`type`.Field.Cardinality.CARDINALITY_UNKNOWN.scalaValueDescriptor).number),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(3).get).map(_.as[_root_.scala.Int]).getOrElse(0),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(4).get).map(_.as[_root_.scala.Predef.String]).getOrElse(""),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(6).get).map(_.as[_root_.scala.Predef.String]).getOrElse(""),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(7).get).map(_.as[_root_.scala.Int]).getOrElse(0),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(8).get).map(_.as[_root_.scala.Boolean]).getOrElse(false),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(9).get).map(_.as[_root_.scala.collection.Seq[com.google.protobuf.`type`.OptionProto]]).getOrElse(_root_.scala.collection.Seq.empty),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(10).get).map(_.as[_root_.scala.Predef.String]).getOrElse(""),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(11).get).map(_.as[_root_.scala.Predef.String]).getOrElse("")
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = TypeProto.javaDescriptor.getMessageTypes.get(1)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = TypeProto.scalaDescriptor.messages(1)
  def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = {
    var __out: _root_.scalapb.GeneratedMessageCompanion[_] = null
    (__number: @_root_.scala.unchecked) match {
      case 9 => __out = com.google.protobuf.`type`.OptionProto
    }
    __out
  }
  lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_]] = Seq.empty
  def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = {
    (__fieldNumber: @_root_.scala.unchecked) match {
      case 1 => com.google.protobuf.`type`.Field.Kind
      case 2 => com.google.protobuf.`type`.Field.Cardinality
    }
  }
  lazy val defaultInstance = com.google.protobuf.`type`.Field(
  )
  sealed trait Kind extends _root_.scalapb.GeneratedEnum {
    type EnumType = Kind
    def isTypeUnknown: _root_.scala.Boolean = false
    def isTypeDouble: _root_.scala.Boolean = false
    def isTypeFloat: _root_.scala.Boolean = false
    def isTypeInt64: _root_.scala.Boolean = false
    def isTypeUint64: _root_.scala.Boolean = false
    def isTypeInt32: _root_.scala.Boolean = false
    def isTypeFixed64: _root_.scala.Boolean = false
    def isTypeFixed32: _root_.scala.Boolean = false
    def isTypeBool: _root_.scala.Boolean = false
    def isTypeString: _root_.scala.Boolean = false
    def isTypeGroup: _root_.scala.Boolean = false
    def isTypeMessage: _root_.scala.Boolean = false
    def isTypeBytes: _root_.scala.Boolean = false
    def isTypeUint32: _root_.scala.Boolean = false
    def isTypeEnum: _root_.scala.Boolean = false
    def isTypeSfixed32: _root_.scala.Boolean = false
    def isTypeSfixed64: _root_.scala.Boolean = false
    def isTypeSint32: _root_.scala.Boolean = false
    def isTypeSint64: _root_.scala.Boolean = false
    def companion: _root_.scalapb.GeneratedEnumCompanion[Kind] = com.google.protobuf.`type`.Field.Kind
  }
  
  object Kind extends _root_.scalapb.GeneratedEnumCompanion[Kind] {
    implicit def enumCompanion: _root_.scalapb.GeneratedEnumCompanion[Kind] = this
    @SerialVersionUID(0L)
    case object TYPE_UNKNOWN extends Kind {
      val value = 0
      val index = 0
      val name = "TYPE_UNKNOWN"
      override def isTypeUnknown: _root_.scala.Boolean = true
    }
    
    @SerialVersionUID(0L)
    case object TYPE_DOUBLE extends Kind {
      val value = 1
      val index = 1
      val name = "TYPE_DOUBLE"
      override def isTypeDouble: _root_.scala.Boolean = true
    }
    
    @SerialVersionUID(0L)
    case object TYPE_FLOAT extends Kind {
      val value = 2
      val index = 2
      val name = "TYPE_FLOAT"
      override def isTypeFloat: _root_.scala.Boolean = true
    }
    
    @SerialVersionUID(0L)
    case object TYPE_INT64 extends Kind {
      val value = 3
      val index = 3
      val name = "TYPE_INT64"
      override def isTypeInt64: _root_.scala.Boolean = true
    }
    
    @SerialVersionUID(0L)
    case object TYPE_UINT64 extends Kind {
      val value = 4
      val index = 4
      val name = "TYPE_UINT64"
      override def isTypeUint64: _root_.scala.Boolean = true
    }
    
    @SerialVersionUID(0L)
    case object TYPE_INT32 extends Kind {
      val value = 5
      val index = 5
      val name = "TYPE_INT32"
      override def isTypeInt32: _root_.scala.Boolean = true
    }
    
    @SerialVersionUID(0L)
    case object TYPE_FIXED64 extends Kind {
      val value = 6
      val index = 6
      val name = "TYPE_FIXED64"
      override def isTypeFixed64: _root_.scala.Boolean = true
    }
    
    @SerialVersionUID(0L)
    case object TYPE_FIXED32 extends Kind {
      val value = 7
      val index = 7
      val name = "TYPE_FIXED32"
      override def isTypeFixed32: _root_.scala.Boolean = true
    }
    
    @SerialVersionUID(0L)
    case object TYPE_BOOL extends Kind {
      val value = 8
      val index = 8
      val name = "TYPE_BOOL"
      override def isTypeBool: _root_.scala.Boolean = true
    }
    
    @SerialVersionUID(0L)
    case object TYPE_STRING extends Kind {
      val value = 9
      val index = 9
      val name = "TYPE_STRING"
      override def isTypeString: _root_.scala.Boolean = true
    }
    
    @SerialVersionUID(0L)
    case object TYPE_GROUP extends Kind {
      val value = 10
      val index = 10
      val name = "TYPE_GROUP"
      override def isTypeGroup: _root_.scala.Boolean = true
    }
    
    @SerialVersionUID(0L)
    case object TYPE_MESSAGE extends Kind {
      val value = 11
      val index = 11
      val name = "TYPE_MESSAGE"
      override def isTypeMessage: _root_.scala.Boolean = true
    }
    
    @SerialVersionUID(0L)
    case object TYPE_BYTES extends Kind {
      val value = 12
      val index = 12
      val name = "TYPE_BYTES"
      override def isTypeBytes: _root_.scala.Boolean = true
    }
    
    @SerialVersionUID(0L)
    case object TYPE_UINT32 extends Kind {
      val value = 13
      val index = 13
      val name = "TYPE_UINT32"
      override def isTypeUint32: _root_.scala.Boolean = true
    }
    
    @SerialVersionUID(0L)
    case object TYPE_ENUM extends Kind {
      val value = 14
      val index = 14
      val name = "TYPE_ENUM"
      override def isTypeEnum: _root_.scala.Boolean = true
    }
    
    @SerialVersionUID(0L)
    case object TYPE_SFIXED32 extends Kind {
      val value = 15
      val index = 15
      val name = "TYPE_SFIXED32"
      override def isTypeSfixed32: _root_.scala.Boolean = true
    }
    
    @SerialVersionUID(0L)
    case object TYPE_SFIXED64 extends Kind {
      val value = 16
      val index = 16
      val name = "TYPE_SFIXED64"
      override def isTypeSfixed64: _root_.scala.Boolean = true
    }
    
    @SerialVersionUID(0L)
    case object TYPE_SINT32 extends Kind {
      val value = 17
      val index = 17
      val name = "TYPE_SINT32"
      override def isTypeSint32: _root_.scala.Boolean = true
    }
    
    @SerialVersionUID(0L)
    case object TYPE_SINT64 extends Kind {
      val value = 18
      val index = 18
      val name = "TYPE_SINT64"
      override def isTypeSint64: _root_.scala.Boolean = true
    }
    
    @SerialVersionUID(0L)
    final case class Unrecognized(value: _root_.scala.Int) extends Kind with _root_.scalapb.UnrecognizedEnum
    
    lazy val values = scala.collection.Seq(TYPE_UNKNOWN, TYPE_DOUBLE, TYPE_FLOAT, TYPE_INT64, TYPE_UINT64, TYPE_INT32, TYPE_FIXED64, TYPE_FIXED32, TYPE_BOOL, TYPE_STRING, TYPE_GROUP, TYPE_MESSAGE, TYPE_BYTES, TYPE_UINT32, TYPE_ENUM, TYPE_SFIXED32, TYPE_SFIXED64, TYPE_SINT32, TYPE_SINT64)
    def fromValue(value: _root_.scala.Int): Kind = value match {
      case 0 => TYPE_UNKNOWN
      case 1 => TYPE_DOUBLE
      case 2 => TYPE_FLOAT
      case 3 => TYPE_INT64
      case 4 => TYPE_UINT64
      case 5 => TYPE_INT32
      case 6 => TYPE_FIXED64
      case 7 => TYPE_FIXED32
      case 8 => TYPE_BOOL
      case 9 => TYPE_STRING
      case 10 => TYPE_GROUP
      case 11 => TYPE_MESSAGE
      case 12 => TYPE_BYTES
      case 13 => TYPE_UINT32
      case 14 => TYPE_ENUM
      case 15 => TYPE_SFIXED32
      case 16 => TYPE_SFIXED64
      case 17 => TYPE_SINT32
      case 18 => TYPE_SINT64
      case __other => Unrecognized(__other)
    }
    def javaDescriptor: _root_.com.google.protobuf.Descriptors.EnumDescriptor = com.google.protobuf.`type`.Field.javaDescriptor.getEnumTypes.get(0)
    def scalaDescriptor: _root_.scalapb.descriptors.EnumDescriptor = com.google.protobuf.`type`.Field.scalaDescriptor.enums(0)
  }
  sealed trait Cardinality extends _root_.scalapb.GeneratedEnum {
    type EnumType = Cardinality
    def isCardinalityUnknown: _root_.scala.Boolean = false
    def isCardinalityOptional: _root_.scala.Boolean = false
    def isCardinalityRequired: _root_.scala.Boolean = false
    def isCardinalityRepeated: _root_.scala.Boolean = false
    def companion: _root_.scalapb.GeneratedEnumCompanion[Cardinality] = com.google.protobuf.`type`.Field.Cardinality
  }
  
  object Cardinality extends _root_.scalapb.GeneratedEnumCompanion[Cardinality] {
    implicit def enumCompanion: _root_.scalapb.GeneratedEnumCompanion[Cardinality] = this
    @SerialVersionUID(0L)
    case object CARDINALITY_UNKNOWN extends Cardinality {
      val value = 0
      val index = 0
      val name = "CARDINALITY_UNKNOWN"
      override def isCardinalityUnknown: _root_.scala.Boolean = true
    }
    
    @SerialVersionUID(0L)
    case object CARDINALITY_OPTIONAL extends Cardinality {
      val value = 1
      val index = 1
      val name = "CARDINALITY_OPTIONAL"
      override def isCardinalityOptional: _root_.scala.Boolean = true
    }
    
    @SerialVersionUID(0L)
    case object CARDINALITY_REQUIRED extends Cardinality {
      val value = 2
      val index = 2
      val name = "CARDINALITY_REQUIRED"
      override def isCardinalityRequired: _root_.scala.Boolean = true
    }
    
    @SerialVersionUID(0L)
    case object CARDINALITY_REPEATED extends Cardinality {
      val value = 3
      val index = 3
      val name = "CARDINALITY_REPEATED"
      override def isCardinalityRepeated: _root_.scala.Boolean = true
    }
    
    @SerialVersionUID(0L)
    final case class Unrecognized(value: _root_.scala.Int) extends Cardinality with _root_.scalapb.UnrecognizedEnum
    
    lazy val values = scala.collection.Seq(CARDINALITY_UNKNOWN, CARDINALITY_OPTIONAL, CARDINALITY_REQUIRED, CARDINALITY_REPEATED)
    def fromValue(value: _root_.scala.Int): Cardinality = value match {
      case 0 => CARDINALITY_UNKNOWN
      case 1 => CARDINALITY_OPTIONAL
      case 2 => CARDINALITY_REQUIRED
      case 3 => CARDINALITY_REPEATED
      case __other => Unrecognized(__other)
    }
    def javaDescriptor: _root_.com.google.protobuf.Descriptors.EnumDescriptor = com.google.protobuf.`type`.Field.javaDescriptor.getEnumTypes.get(1)
    def scalaDescriptor: _root_.scalapb.descriptors.EnumDescriptor = com.google.protobuf.`type`.Field.scalaDescriptor.enums(1)
  }
  implicit class FieldLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, com.google.protobuf.`type`.Field]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, com.google.protobuf.`type`.Field](_l) {
    def kind: _root_.scalapb.lenses.Lens[UpperPB, com.google.protobuf.`type`.Field.Kind] = field(_.kind)((c_, f_) => c_.copy(kind = f_))
    def cardinality: _root_.scalapb.lenses.Lens[UpperPB, com.google.protobuf.`type`.Field.Cardinality] = field(_.cardinality)((c_, f_) => c_.copy(cardinality = f_))
    def number: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Int] = field(_.number)((c_, f_) => c_.copy(number = f_))
    def name: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.name)((c_, f_) => c_.copy(name = f_))
    def typeUrl: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.typeUrl)((c_, f_) => c_.copy(typeUrl = f_))
    def oneofIndex: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Int] = field(_.oneofIndex)((c_, f_) => c_.copy(oneofIndex = f_))
    def packed: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Boolean] = field(_.packed)((c_, f_) => c_.copy(packed = f_))
    def options: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.collection.Seq[com.google.protobuf.`type`.OptionProto]] = field(_.options)((c_, f_) => c_.copy(options = f_))
    def jsonName: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.jsonName)((c_, f_) => c_.copy(jsonName = f_))
    def defaultValue: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.defaultValue)((c_, f_) => c_.copy(defaultValue = f_))
  }
  final val KIND_FIELD_NUMBER = 1
  final val CARDINALITY_FIELD_NUMBER = 2
  final val NUMBER_FIELD_NUMBER = 3
  final val NAME_FIELD_NUMBER = 4
  final val TYPE_URL_FIELD_NUMBER = 6
  final val ONEOF_INDEX_FIELD_NUMBER = 7
  final val PACKED_FIELD_NUMBER = 8
  final val OPTIONS_FIELD_NUMBER = 9
  final val JSON_NAME_FIELD_NUMBER = 10
  final val DEFAULT_VALUE_FIELD_NUMBER = 11
}
