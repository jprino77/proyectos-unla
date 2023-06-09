/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package server;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.11.0)", date = "2018-11-03")
public class GenericException extends org.apache.thrift.TException implements org.apache.thrift.TBase<GenericException, GenericException._Fields>, java.io.Serializable, Cloneable, Comparable<GenericException> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("GenericException");

  private static final org.apache.thrift.protocol.TField CODIGO_FIELD_DESC = new org.apache.thrift.protocol.TField("codigo", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField DESCRIPCION_FIELD_DESC = new org.apache.thrift.protocol.TField("descripcion", org.apache.thrift.protocol.TType.STRING, (short)2);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new GenericExceptionStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new GenericExceptionTupleSchemeFactory();

  public int codigo; // required
  public java.lang.String descripcion; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    CODIGO((short)1, "codigo"),
    DESCRIPCION((short)2, "descripcion");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // CODIGO
          return CODIGO;
        case 2: // DESCRIPCION
          return DESCRIPCION;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(java.lang.String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final java.lang.String _fieldName;

    _Fields(short thriftId, java.lang.String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public java.lang.String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __CODIGO_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.CODIGO, new org.apache.thrift.meta_data.FieldMetaData("codigo", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.DESCRIPCION, new org.apache.thrift.meta_data.FieldMetaData("descripcion", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(GenericException.class, metaDataMap);
  }

  public GenericException() {
  }

  public GenericException(
    int codigo,
    java.lang.String descripcion)
  {
    this();
    this.codigo = codigo;
    setCodigoIsSet(true);
    this.descripcion = descripcion;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public GenericException(GenericException other) {
    __isset_bitfield = other.__isset_bitfield;
    this.codigo = other.codigo;
    if (other.isSetDescripcion()) {
      this.descripcion = other.descripcion;
    }
  }

  public GenericException deepCopy() {
    return new GenericException(this);
  }

  @Override
  public void clear() {
    setCodigoIsSet(false);
    this.codigo = 0;
    this.descripcion = null;
  }

  public int getCodigo() {
    return this.codigo;
  }

  public GenericException setCodigo(int codigo) {
    this.codigo = codigo;
    setCodigoIsSet(true);
    return this;
  }

  public void unsetCodigo() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __CODIGO_ISSET_ID);
  }

  /** Returns true if field codigo is set (has been assigned a value) and false otherwise */
  public boolean isSetCodigo() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __CODIGO_ISSET_ID);
  }

  public void setCodigoIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __CODIGO_ISSET_ID, value);
  }

  public java.lang.String getDescripcion() {
    return this.descripcion;
  }

  public GenericException setDescripcion(java.lang.String descripcion) {
    this.descripcion = descripcion;
    return this;
  }

  public void unsetDescripcion() {
    this.descripcion = null;
  }

  /** Returns true if field descripcion is set (has been assigned a value) and false otherwise */
  public boolean isSetDescripcion() {
    return this.descripcion != null;
  }

  public void setDescripcionIsSet(boolean value) {
    if (!value) {
      this.descripcion = null;
    }
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case CODIGO:
      if (value == null) {
        unsetCodigo();
      } else {
        setCodigo((java.lang.Integer)value);
      }
      break;

    case DESCRIPCION:
      if (value == null) {
        unsetDescripcion();
      } else {
        setDescripcion((java.lang.String)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case CODIGO:
      return getCodigo();

    case DESCRIPCION:
      return getDescripcion();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case CODIGO:
      return isSetCodigo();
    case DESCRIPCION:
      return isSetDescripcion();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof GenericException)
      return this.equals((GenericException)that);
    return false;
  }

  public boolean equals(GenericException that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_codigo = true;
    boolean that_present_codigo = true;
    if (this_present_codigo || that_present_codigo) {
      if (!(this_present_codigo && that_present_codigo))
        return false;
      if (this.codigo != that.codigo)
        return false;
    }

    boolean this_present_descripcion = true && this.isSetDescripcion();
    boolean that_present_descripcion = true && that.isSetDescripcion();
    if (this_present_descripcion || that_present_descripcion) {
      if (!(this_present_descripcion && that_present_descripcion))
        return false;
      if (!this.descripcion.equals(that.descripcion))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + codigo;

    hashCode = hashCode * 8191 + ((isSetDescripcion()) ? 131071 : 524287);
    if (isSetDescripcion())
      hashCode = hashCode * 8191 + descripcion.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(GenericException other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetCodigo()).compareTo(other.isSetCodigo());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCodigo()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.codigo, other.codigo);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetDescripcion()).compareTo(other.isSetDescripcion());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDescripcion()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.descripcion, other.descripcion);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("GenericException(");
    boolean first = true;

    sb.append("codigo:");
    sb.append(this.codigo);
    first = false;
    if (!first) sb.append(", ");
    sb.append("descripcion:");
    if (this.descripcion == null) {
      sb.append("null");
    } else {
      sb.append(this.descripcion);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class GenericExceptionStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public GenericExceptionStandardScheme getScheme() {
      return new GenericExceptionStandardScheme();
    }
  }

  private static class GenericExceptionStandardScheme extends org.apache.thrift.scheme.StandardScheme<GenericException> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, GenericException struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // CODIGO
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.codigo = iprot.readI32();
              struct.setCodigoIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // DESCRIPCION
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.descripcion = iprot.readString();
              struct.setDescripcionIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, GenericException struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(CODIGO_FIELD_DESC);
      oprot.writeI32(struct.codigo);
      oprot.writeFieldEnd();
      if (struct.descripcion != null) {
        oprot.writeFieldBegin(DESCRIPCION_FIELD_DESC);
        oprot.writeString(struct.descripcion);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class GenericExceptionTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public GenericExceptionTupleScheme getScheme() {
      return new GenericExceptionTupleScheme();
    }
  }

  private static class GenericExceptionTupleScheme extends org.apache.thrift.scheme.TupleScheme<GenericException> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, GenericException struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetCodigo()) {
        optionals.set(0);
      }
      if (struct.isSetDescripcion()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetCodigo()) {
        oprot.writeI32(struct.codigo);
      }
      if (struct.isSetDescripcion()) {
        oprot.writeString(struct.descripcion);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, GenericException struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.codigo = iprot.readI32();
        struct.setCodigoIsSet(true);
      }
      if (incoming.get(1)) {
        struct.descripcion = iprot.readString();
        struct.setDescripcionIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

