// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: DataNode.proto

package com.example.elements;

public final class DataNodeInfo {
  private DataNodeInfo() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface DataNodeOrBuilder extends
      // @@protoc_insertion_point(interface_extends:HDFS.DataNode)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>required int32 id = 1;</code>
     */
    boolean hasId();
    /**
     * <code>required int32 id = 1;</code>
     */
    int getId();

    /**
     * <code>required int32 port = 2;</code>
     */
    boolean hasPort();
    /**
     * <code>required int32 port = 2;</code>
     */
    int getPort();

    /**
     * <code>required string ip = 3;</code>
     */
    boolean hasIp();
    /**
     * <code>required string ip = 3;</code>
     */
    java.lang.String getIp();
    /**
     * <code>required string ip = 3;</code>
     */
    com.google.protobuf.ByteString
        getIpBytes();
  }
  /**
   * Protobuf type {@code HDFS.DataNode}
   */
  public  static final class DataNode extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:HDFS.DataNode)
      DataNodeOrBuilder {
    // Use DataNode.newBuilder() to construct.
    private DataNode(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private DataNode() {
      id_ = 0;
      port_ = 0;
      ip_ = "";
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private DataNode(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 8: {
              bitField0_ |= 0x00000001;
              id_ = input.readInt32();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              port_ = input.readInt32();
              break;
            }
            case 26: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000004;
              ip_ = bs;
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.example.elements.DataNodeInfo.internal_static_HDFS_DataNode_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.example.elements.DataNodeInfo.internal_static_HDFS_DataNode_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.example.elements.DataNodeInfo.DataNode.class, com.example.elements.DataNodeInfo.DataNode.Builder.class);
    }

    private int bitField0_;
    public static final int ID_FIELD_NUMBER = 1;
    private int id_;
    /**
     * <code>required int32 id = 1;</code>
     */
    public boolean hasId() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required int32 id = 1;</code>
     */
    public int getId() {
      return id_;
    }

    public static final int PORT_FIELD_NUMBER = 2;
    private int port_;
    /**
     * <code>required int32 port = 2;</code>
     */
    public boolean hasPort() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>required int32 port = 2;</code>
     */
    public int getPort() {
      return port_;
    }

    public static final int IP_FIELD_NUMBER = 3;
    private volatile java.lang.Object ip_;
    /**
     * <code>required string ip = 3;</code>
     */
    public boolean hasIp() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>required string ip = 3;</code>
     */
    public java.lang.String getIp() {
      java.lang.Object ref = ip_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          ip_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string ip = 3;</code>
     */
    public com.google.protobuf.ByteString
        getIpBytes() {
      java.lang.Object ref = ip_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        ip_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasId()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasPort()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasIp()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeInt32(1, id_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeInt32(2, port_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 3, ip_);
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, id_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, port_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, ip_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof com.example.elements.DataNodeInfo.DataNode)) {
        return super.equals(obj);
      }
      com.example.elements.DataNodeInfo.DataNode other = (com.example.elements.DataNodeInfo.DataNode) obj;

      boolean result = true;
      result = result && (hasId() == other.hasId());
      if (hasId()) {
        result = result && (getId()
            == other.getId());
      }
      result = result && (hasPort() == other.hasPort());
      if (hasPort()) {
        result = result && (getPort()
            == other.getPort());
      }
      result = result && (hasIp() == other.hasIp());
      if (hasIp()) {
        result = result && getIp()
            .equals(other.getIp());
      }
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasId()) {
        hash = (37 * hash) + ID_FIELD_NUMBER;
        hash = (53 * hash) + getId();
      }
      if (hasPort()) {
        hash = (37 * hash) + PORT_FIELD_NUMBER;
        hash = (53 * hash) + getPort();
      }
      if (hasIp()) {
        hash = (37 * hash) + IP_FIELD_NUMBER;
        hash = (53 * hash) + getIp().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.example.elements.DataNodeInfo.DataNode parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.example.elements.DataNodeInfo.DataNode parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.example.elements.DataNodeInfo.DataNode parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.example.elements.DataNodeInfo.DataNode parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.example.elements.DataNodeInfo.DataNode parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.example.elements.DataNodeInfo.DataNode parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.example.elements.DataNodeInfo.DataNode parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.example.elements.DataNodeInfo.DataNode parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.example.elements.DataNodeInfo.DataNode parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.example.elements.DataNodeInfo.DataNode parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.example.elements.DataNodeInfo.DataNode parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.example.elements.DataNodeInfo.DataNode parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(com.example.elements.DataNodeInfo.DataNode prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code HDFS.DataNode}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:HDFS.DataNode)
        com.example.elements.DataNodeInfo.DataNodeOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.example.elements.DataNodeInfo.internal_static_HDFS_DataNode_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.example.elements.DataNodeInfo.internal_static_HDFS_DataNode_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.example.elements.DataNodeInfo.DataNode.class, com.example.elements.DataNodeInfo.DataNode.Builder.class);
      }

      // Construct using com.example.elements.DataNodeInfo.DataNode.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      public Builder clear() {
        super.clear();
        id_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        port_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        ip_ = "";
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.example.elements.DataNodeInfo.internal_static_HDFS_DataNode_descriptor;
      }

      public com.example.elements.DataNodeInfo.DataNode getDefaultInstanceForType() {
        return com.example.elements.DataNodeInfo.DataNode.getDefaultInstance();
      }

      public com.example.elements.DataNodeInfo.DataNode build() {
        com.example.elements.DataNodeInfo.DataNode result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.example.elements.DataNodeInfo.DataNode buildPartial() {
        com.example.elements.DataNodeInfo.DataNode result = new com.example.elements.DataNodeInfo.DataNode(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.id_ = id_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.port_ = port_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.ip_ = ip_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder clone() {
        return (Builder) super.clone();
      }
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return (Builder) super.setField(field, value);
      }
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.example.elements.DataNodeInfo.DataNode) {
          return mergeFrom((com.example.elements.DataNodeInfo.DataNode)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.example.elements.DataNodeInfo.DataNode other) {
        if (other == com.example.elements.DataNodeInfo.DataNode.getDefaultInstance()) return this;
        if (other.hasId()) {
          setId(other.getId());
        }
        if (other.hasPort()) {
          setPort(other.getPort());
        }
        if (other.hasIp()) {
          bitField0_ |= 0x00000004;
          ip_ = other.ip_;
          onChanged();
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      public final boolean isInitialized() {
        if (!hasId()) {
          return false;
        }
        if (!hasPort()) {
          return false;
        }
        if (!hasIp()) {
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.example.elements.DataNodeInfo.DataNode parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.example.elements.DataNodeInfo.DataNode) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int id_ ;
      /**
       * <code>required int32 id = 1;</code>
       */
      public boolean hasId() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required int32 id = 1;</code>
       */
      public int getId() {
        return id_;
      }
      /**
       * <code>required int32 id = 1;</code>
       */
      public Builder setId(int value) {
        bitField0_ |= 0x00000001;
        id_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int32 id = 1;</code>
       */
      public Builder clearId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        id_ = 0;
        onChanged();
        return this;
      }

      private int port_ ;
      /**
       * <code>required int32 port = 2;</code>
       */
      public boolean hasPort() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>required int32 port = 2;</code>
       */
      public int getPort() {
        return port_;
      }
      /**
       * <code>required int32 port = 2;</code>
       */
      public Builder setPort(int value) {
        bitField0_ |= 0x00000002;
        port_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int32 port = 2;</code>
       */
      public Builder clearPort() {
        bitField0_ = (bitField0_ & ~0x00000002);
        port_ = 0;
        onChanged();
        return this;
      }

      private java.lang.Object ip_ = "";
      /**
       * <code>required string ip = 3;</code>
       */
      public boolean hasIp() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>required string ip = 3;</code>
       */
      public java.lang.String getIp() {
        java.lang.Object ref = ip_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            ip_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string ip = 3;</code>
       */
      public com.google.protobuf.ByteString
          getIpBytes() {
        java.lang.Object ref = ip_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          ip_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string ip = 3;</code>
       */
      public Builder setIp(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
        ip_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string ip = 3;</code>
       */
      public Builder clearIp() {
        bitField0_ = (bitField0_ & ~0x00000004);
        ip_ = getDefaultInstance().getIp();
        onChanged();
        return this;
      }
      /**
       * <code>required string ip = 3;</code>
       */
      public Builder setIpBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
        ip_ = value;
        onChanged();
        return this;
      }
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:HDFS.DataNode)
    }

    // @@protoc_insertion_point(class_scope:HDFS.DataNode)
    private static final com.example.elements.DataNodeInfo.DataNode DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.example.elements.DataNodeInfo.DataNode();
    }

    public static com.example.elements.DataNodeInfo.DataNode getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<DataNode>
        PARSER = new com.google.protobuf.AbstractParser<DataNode>() {
      public DataNode parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
          return new DataNode(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<DataNode> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<DataNode> getParserForType() {
      return PARSER;
    }

    public com.example.elements.DataNodeInfo.DataNode getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_HDFS_DataNode_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_HDFS_DataNode_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\016DataNode.proto\022\004HDFS\"0\n\010DataNode\022\n\n\002id" +
      "\030\001 \002(\005\022\014\n\004port\030\002 \002(\005\022\n\n\002ip\030\003 \002(\tB$\n\024com." +
      "example.elementsB\014DataNodeInfo"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_HDFS_DataNode_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_HDFS_DataNode_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_HDFS_DataNode_descriptor,
        new java.lang.String[] { "Id", "Port", "Ip", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}