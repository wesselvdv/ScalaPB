// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO2

package com.google.protobuf.descriptor
import scala.collection.JavaConverters._

/** Describes the relationship between generated code and its original source
  * file. A GeneratedCodeInfo message is associated with only one generated
  * source file, but may contain references to different source .proto files.
  *
  * @param annotation
  *   An Annotation connects some span of text in generated code to an element
  *   of its generating .proto file.
  */
@SerialVersionUID(0L)
final case class GeneratedCodeInfo(
    annotation: _root_.scala.collection.Seq[com.google.protobuf.descriptor.GeneratedCodeInfo.Annotation] = _root_.scala.collection.Seq.empty
    ) extends scalapb.GeneratedMessage with scalapb.Message[GeneratedCodeInfo] with scalapb.lenses.Updatable[GeneratedCodeInfo] {
    @transient
    private[this] var __serializedSizeCachedValue: _root_.scala.Int = 0
    private[this] def __computeSerializedValue(): _root_.scala.Int = {
      var __size = 0
      annotation.foreach { __item =>
        val __value = __item
        __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(__value.serializedSize) + __value.serializedSize
      }
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
      annotation.foreach { __v =>
        val __m = __v
        _output__.writeTag(1, 2)
        _output__.writeUInt32NoTag(__m.serializedSize)
        __m.writeTo(_output__)
      };
    }
    def mergeFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): com.google.protobuf.descriptor.GeneratedCodeInfo = {
      val __annotation = (_root_.scala.collection.immutable.Vector.newBuilder[com.google.protobuf.descriptor.GeneratedCodeInfo.Annotation] ++= this.annotation)
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 10 =>
            __annotation += _root_.scalapb.LiteParser.readMessage(_input__, com.google.protobuf.descriptor.GeneratedCodeInfo.Annotation.defaultInstance)
          case tag => _input__.skipField(tag)
        }
      }
      com.google.protobuf.descriptor.GeneratedCodeInfo(
          annotation = __annotation.result()
      )
    }
    def clearAnnotation = copy(annotation = _root_.scala.collection.Seq.empty)
    def addAnnotation(__vs: com.google.protobuf.descriptor.GeneratedCodeInfo.Annotation*): GeneratedCodeInfo = addAllAnnotation(__vs)
    def addAllAnnotation(__vs: TraversableOnce[com.google.protobuf.descriptor.GeneratedCodeInfo.Annotation]): GeneratedCodeInfo = copy(annotation = annotation ++ __vs)
    def withAnnotation(__v: _root_.scala.collection.Seq[com.google.protobuf.descriptor.GeneratedCodeInfo.Annotation]): GeneratedCodeInfo = copy(annotation = __v)
    def getFieldByNumber(__fieldNumber: _root_.scala.Int): _root_.scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => annotation
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      _root_.scala.Predef.require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => _root_.scalapb.descriptors.PRepeated(annotation.map(_.toPMessage)(_root_.scala.collection.breakOut))
      }
    }
    def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
    def companion = com.google.protobuf.descriptor.GeneratedCodeInfo
}

object GeneratedCodeInfo extends scalapb.GeneratedMessageCompanion[com.google.protobuf.descriptor.GeneratedCodeInfo] with scalapb.JavaProtoSupport[com.google.protobuf.descriptor.GeneratedCodeInfo, com.google.protobuf.DescriptorProtos.GeneratedCodeInfo] {
  implicit def messageCompanion: scalapb.GeneratedMessageCompanion[com.google.protobuf.descriptor.GeneratedCodeInfo] with scalapb.JavaProtoSupport[com.google.protobuf.descriptor.GeneratedCodeInfo, com.google.protobuf.DescriptorProtos.GeneratedCodeInfo] = this
  def toJavaProto(scalaPbSource: com.google.protobuf.descriptor.GeneratedCodeInfo): com.google.protobuf.DescriptorProtos.GeneratedCodeInfo = {
    val javaPbOut = com.google.protobuf.DescriptorProtos.GeneratedCodeInfo.newBuilder
    javaPbOut.addAllAnnotation(scalaPbSource.annotation.map(com.google.protobuf.descriptor.GeneratedCodeInfo.Annotation.toJavaProto)(_root_.scala.collection.breakOut).asJava)
    javaPbOut.build
  }
  def fromJavaProto(javaPbSource: com.google.protobuf.DescriptorProtos.GeneratedCodeInfo): com.google.protobuf.descriptor.GeneratedCodeInfo = com.google.protobuf.descriptor.GeneratedCodeInfo(
    annotation = javaPbSource.getAnnotationList.asScala.map(com.google.protobuf.descriptor.GeneratedCodeInfo.Annotation.fromJavaProto)(_root_.scala.collection.breakOut)
  )
  def fromFieldsMap(__fieldsMap: scala.collection.immutable.Map[_root_.com.google.protobuf.Descriptors.FieldDescriptor, _root_.scala.Any]): com.google.protobuf.descriptor.GeneratedCodeInfo = {
    _root_.scala.Predef.require(__fieldsMap.keys.forall(_.getContainingType() == javaDescriptor), "FieldDescriptor does not match message type.")
    val __fields = javaDescriptor.getFields
    com.google.protobuf.descriptor.GeneratedCodeInfo(
      __fieldsMap.getOrElse(__fields.get(0), Nil).asInstanceOf[_root_.scala.collection.Seq[com.google.protobuf.descriptor.GeneratedCodeInfo.Annotation]]
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[com.google.protobuf.descriptor.GeneratedCodeInfo] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      _root_.scala.Predef.require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
      com.google.protobuf.descriptor.GeneratedCodeInfo(
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).map(_.as[_root_.scala.collection.Seq[com.google.protobuf.descriptor.GeneratedCodeInfo.Annotation]]).getOrElse(_root_.scala.collection.Seq.empty)
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = DescriptorProtoCompanion.javaDescriptor.getMessageTypes.get(19)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = DescriptorProtoCompanion.scalaDescriptor.messages(19)
  def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = {
    var __out: _root_.scalapb.GeneratedMessageCompanion[_] = null
    (__number: @_root_.scala.unchecked) match {
      case 1 => __out = com.google.protobuf.descriptor.GeneratedCodeInfo.Annotation
    }
    __out
  }
  lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_]] = Seq[_root_.scalapb.GeneratedMessageCompanion[_]](
    _root_.com.google.protobuf.descriptor.GeneratedCodeInfo.Annotation
  )
  def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
  lazy val defaultInstance = com.google.protobuf.descriptor.GeneratedCodeInfo(
  )
  /** @param path
    *   Identifies the element in the original source .proto file. This field
    *   is formatted the same as SourceCodeInfo.Location.path.
    * @param sourceFile
    *   Identifies the filesystem path to the original source .proto.
    * @param begin
    *   Identifies the starting offset in bytes in the generated code
    *   that relates to the identified object.
    * @param end
    *   Identifies the ending offset in bytes in the generated code that
    *   relates to the identified offset. The end offset should be one past
    *   the last relevant byte (so the length of the text = end - begin).
    */
  @SerialVersionUID(0L)
  final case class Annotation(
      path: _root_.scala.collection.Seq[_root_.scala.Int] = _root_.scala.collection.Seq.empty,
      sourceFile: _root_.scala.Option[_root_.scala.Predef.String] = None,
      begin: _root_.scala.Option[_root_.scala.Int] = None,
      end: _root_.scala.Option[_root_.scala.Int] = None
      ) extends scalapb.GeneratedMessage with scalapb.Message[Annotation] with scalapb.lenses.Updatable[Annotation] {
      private[this] def pathSerializedSize = {
        if (__pathSerializedSizeField == 0) __pathSerializedSizeField = {
          var __s: _root_.scala.Int = 0
          path.foreach(__i => __s += _root_.com.google.protobuf.CodedOutputStream.computeInt32SizeNoTag(__i))
          __s
        }
        __pathSerializedSizeField
      }
      @transient private[this] var __pathSerializedSizeField: _root_.scala.Int = 0
      @transient
      private[this] var __serializedSizeCachedValue: _root_.scala.Int = 0
      private[this] def __computeSerializedValue(): _root_.scala.Int = {
        var __size = 0
        if(path.nonEmpty) {
          val __localsize = pathSerializedSize
          __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(__localsize) + __localsize
        }
        if (sourceFile.isDefined) {
          val __value = sourceFile.get
          __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(2, __value)
        };
        if (begin.isDefined) {
          val __value = begin.get
          __size += _root_.com.google.protobuf.CodedOutputStream.computeInt32Size(3, __value)
        };
        if (end.isDefined) {
          val __value = end.get
          __size += _root_.com.google.protobuf.CodedOutputStream.computeInt32Size(4, __value)
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
        if (path.nonEmpty) {
          _output__.writeTag(1, 2)
          _output__.writeUInt32NoTag(pathSerializedSize)
          path.foreach(_output__.writeInt32NoTag)
        };
        sourceFile.foreach { __v =>
          val __m = __v
          _output__.writeString(2, __m)
        };
        begin.foreach { __v =>
          val __m = __v
          _output__.writeInt32(3, __m)
        };
        end.foreach { __v =>
          val __m = __v
          _output__.writeInt32(4, __m)
        };
      }
      def mergeFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): com.google.protobuf.descriptor.GeneratedCodeInfo.Annotation = {
        val __path = (_root_.scala.collection.immutable.Vector.newBuilder[_root_.scala.Int] ++= this.path)
        var __sourceFile = this.sourceFile
        var __begin = this.begin
        var __end = this.end
        var _done__ = false
        while (!_done__) {
          val _tag__ = _input__.readTag()
          _tag__ match {
            case 0 => _done__ = true
            case 8 =>
              __path += _input__.readInt32()
            case 10 => {
              val length = _input__.readRawVarint32()
              val oldLimit = _input__.pushLimit(length)
              while (_input__.getBytesUntilLimit > 0) {
                __path += _input__.readInt32
              }
              _input__.popLimit(oldLimit)
            }
            case 18 =>
              __sourceFile = Option(_input__.readString())
            case 24 =>
              __begin = Option(_input__.readInt32())
            case 32 =>
              __end = Option(_input__.readInt32())
            case tag => _input__.skipField(tag)
          }
        }
        com.google.protobuf.descriptor.GeneratedCodeInfo.Annotation(
            path = __path.result(),
            sourceFile = __sourceFile,
            begin = __begin,
            end = __end
        )
      }
      def clearPath = copy(path = _root_.scala.collection.Seq.empty)
      def addPath(__vs: _root_.scala.Int*): Annotation = addAllPath(__vs)
      def addAllPath(__vs: TraversableOnce[_root_.scala.Int]): Annotation = copy(path = path ++ __vs)
      def withPath(__v: _root_.scala.collection.Seq[_root_.scala.Int]): Annotation = copy(path = __v)
      def getSourceFile: _root_.scala.Predef.String = sourceFile.getOrElse("")
      def clearSourceFile: Annotation = copy(sourceFile = None)
      def withSourceFile(__v: _root_.scala.Predef.String): Annotation = copy(sourceFile = Option(__v))
      def getBegin: _root_.scala.Int = begin.getOrElse(0)
      def clearBegin: Annotation = copy(begin = None)
      def withBegin(__v: _root_.scala.Int): Annotation = copy(begin = Option(__v))
      def getEnd: _root_.scala.Int = end.getOrElse(0)
      def clearEnd: Annotation = copy(end = None)
      def withEnd(__v: _root_.scala.Int): Annotation = copy(end = Option(__v))
      def getFieldByNumber(__fieldNumber: _root_.scala.Int): _root_.scala.Any = {
        (__fieldNumber: @_root_.scala.unchecked) match {
          case 1 => path
          case 2 => sourceFile.orNull
          case 3 => begin.orNull
          case 4 => end.orNull
        }
      }
      def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
        _root_.scala.Predef.require(__field.containingMessage eq companion.scalaDescriptor)
        (__field.number: @_root_.scala.unchecked) match {
          case 1 => _root_.scalapb.descriptors.PRepeated(path.map(_root_.scalapb.descriptors.PInt)(_root_.scala.collection.breakOut))
          case 2 => sourceFile.map(_root_.scalapb.descriptors.PString).getOrElse(_root_.scalapb.descriptors.PEmpty)
          case 3 => begin.map(_root_.scalapb.descriptors.PInt).getOrElse(_root_.scalapb.descriptors.PEmpty)
          case 4 => end.map(_root_.scalapb.descriptors.PInt).getOrElse(_root_.scalapb.descriptors.PEmpty)
        }
      }
      def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
      def companion = com.google.protobuf.descriptor.GeneratedCodeInfo.Annotation
  }
  
  object Annotation extends scalapb.GeneratedMessageCompanion[com.google.protobuf.descriptor.GeneratedCodeInfo.Annotation] with scalapb.JavaProtoSupport[com.google.protobuf.descriptor.GeneratedCodeInfo.Annotation, com.google.protobuf.DescriptorProtos.GeneratedCodeInfo.Annotation] {
    implicit def messageCompanion: scalapb.GeneratedMessageCompanion[com.google.protobuf.descriptor.GeneratedCodeInfo.Annotation] with scalapb.JavaProtoSupport[com.google.protobuf.descriptor.GeneratedCodeInfo.Annotation, com.google.protobuf.DescriptorProtos.GeneratedCodeInfo.Annotation] = this
    def toJavaProto(scalaPbSource: com.google.protobuf.descriptor.GeneratedCodeInfo.Annotation): com.google.protobuf.DescriptorProtos.GeneratedCodeInfo.Annotation = {
      val javaPbOut = com.google.protobuf.DescriptorProtos.GeneratedCodeInfo.Annotation.newBuilder
      javaPbOut.addAllPath(scalaPbSource.path.map(_root_.scala.Int.box)(_root_.scala.collection.breakOut).asJava)
      scalaPbSource.sourceFile.foreach(javaPbOut.setSourceFile)
      scalaPbSource.begin.foreach(javaPbOut.setBegin)
      scalaPbSource.end.foreach(javaPbOut.setEnd)
      javaPbOut.build
    }
    def fromJavaProto(javaPbSource: com.google.protobuf.DescriptorProtos.GeneratedCodeInfo.Annotation): com.google.protobuf.descriptor.GeneratedCodeInfo.Annotation = com.google.protobuf.descriptor.GeneratedCodeInfo.Annotation(
      path = javaPbSource.getPathList.asScala.map(_.intValue)(_root_.scala.collection.breakOut),
      sourceFile = if (javaPbSource.hasSourceFile) Some(javaPbSource.getSourceFile) else None,
      begin = if (javaPbSource.hasBegin) Some(javaPbSource.getBegin.intValue) else None,
      end = if (javaPbSource.hasEnd) Some(javaPbSource.getEnd.intValue) else None
    )
    def fromFieldsMap(__fieldsMap: scala.collection.immutable.Map[_root_.com.google.protobuf.Descriptors.FieldDescriptor, _root_.scala.Any]): com.google.protobuf.descriptor.GeneratedCodeInfo.Annotation = {
      _root_.scala.Predef.require(__fieldsMap.keys.forall(_.getContainingType() == javaDescriptor), "FieldDescriptor does not match message type.")
      val __fields = javaDescriptor.getFields
      com.google.protobuf.descriptor.GeneratedCodeInfo.Annotation(
        __fieldsMap.getOrElse(__fields.get(0), Nil).asInstanceOf[_root_.scala.collection.Seq[_root_.scala.Int]],
        __fieldsMap.get(__fields.get(1)).asInstanceOf[_root_.scala.Option[_root_.scala.Predef.String]],
        __fieldsMap.get(__fields.get(2)).asInstanceOf[_root_.scala.Option[_root_.scala.Int]],
        __fieldsMap.get(__fields.get(3)).asInstanceOf[_root_.scala.Option[_root_.scala.Int]]
      )
    }
    implicit def messageReads: _root_.scalapb.descriptors.Reads[com.google.protobuf.descriptor.GeneratedCodeInfo.Annotation] = _root_.scalapb.descriptors.Reads{
      case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
        _root_.scala.Predef.require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
        com.google.protobuf.descriptor.GeneratedCodeInfo.Annotation(
          __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).map(_.as[_root_.scala.collection.Seq[_root_.scala.Int]]).getOrElse(_root_.scala.collection.Seq.empty),
          __fieldsMap.get(scalaDescriptor.findFieldByNumber(2).get).flatMap(_.as[_root_.scala.Option[_root_.scala.Predef.String]]),
          __fieldsMap.get(scalaDescriptor.findFieldByNumber(3).get).flatMap(_.as[_root_.scala.Option[_root_.scala.Int]]),
          __fieldsMap.get(scalaDescriptor.findFieldByNumber(4).get).flatMap(_.as[_root_.scala.Option[_root_.scala.Int]])
        )
      case _ => throw new RuntimeException("Expected PMessage")
    }
    def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = com.google.protobuf.descriptor.GeneratedCodeInfo.javaDescriptor.getNestedTypes.get(0)
    def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = com.google.protobuf.descriptor.GeneratedCodeInfo.scalaDescriptor.nestedMessages(0)
    def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = throw new MatchError(__number)
    lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_]] = Seq.empty
    def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
    lazy val defaultInstance = com.google.protobuf.descriptor.GeneratedCodeInfo.Annotation(
    )
    implicit class AnnotationLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, com.google.protobuf.descriptor.GeneratedCodeInfo.Annotation]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, com.google.protobuf.descriptor.GeneratedCodeInfo.Annotation](_l) {
      def path: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.collection.Seq[_root_.scala.Int]] = field(_.path)((c_, f_) => c_.copy(path = f_))
      def sourceFile: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.getSourceFile)((c_, f_) => c_.copy(sourceFile = Option(f_)))
      def optionalSourceFile: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Option[_root_.scala.Predef.String]] = field(_.sourceFile)((c_, f_) => c_.copy(sourceFile = f_))
      def begin: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Int] = field(_.getBegin)((c_, f_) => c_.copy(begin = Option(f_)))
      def optionalBegin: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Option[_root_.scala.Int]] = field(_.begin)((c_, f_) => c_.copy(begin = f_))
      def end: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Int] = field(_.getEnd)((c_, f_) => c_.copy(end = Option(f_)))
      def optionalEnd: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Option[_root_.scala.Int]] = field(_.end)((c_, f_) => c_.copy(end = f_))
    }
    final val PATH_FIELD_NUMBER = 1
    final val SOURCE_FILE_FIELD_NUMBER = 2
    final val BEGIN_FIELD_NUMBER = 3
    final val END_FIELD_NUMBER = 4
  }
  
  implicit class GeneratedCodeInfoLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, com.google.protobuf.descriptor.GeneratedCodeInfo]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, com.google.protobuf.descriptor.GeneratedCodeInfo](_l) {
    def annotation: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.collection.Seq[com.google.protobuf.descriptor.GeneratedCodeInfo.Annotation]] = field(_.annotation)((c_, f_) => c_.copy(annotation = f_))
  }
  final val ANNOTATION_FIELD_NUMBER = 1
}
