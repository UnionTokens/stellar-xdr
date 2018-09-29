// Automatically generated by xdrgen
// DO NOT EDIT or your changes may be overwritten

package io.uniontokens.stellar.xdr;


import java.io.IOException;

// === xdr source ============================================================

//  enum EnvelopeType
//  {
//      ENVELOPE_TYPE_SCP = 1,
//      ENVELOPE_TYPE_TX = 2,
//      ENVELOPE_TYPE_AUTH = 3
//  };

//  ===========================================================================
public enum EnvelopeType  {
  ENVELOPE_TYPE_SCP(1),
  ENVELOPE_TYPE_TX(2),
  ENVELOPE_TYPE_AUTH(3),
  ;
  private int mValue;

  EnvelopeType(int value) {
      mValue = value;
  }

  public int getValue() {
      return mValue;
  }

  static EnvelopeType decode(XdrDataInputStream stream) throws IOException {
    int value = stream.readInt();
    switch (value) {
      case 1: return ENVELOPE_TYPE_SCP;
      case 2: return ENVELOPE_TYPE_TX;
      case 3: return ENVELOPE_TYPE_AUTH;
      default:
        throw new RuntimeException("Unknown enum value: " + value);
    }
  }

  static void encode(XdrDataOutputStream stream, EnvelopeType value) throws IOException {
    stream.writeInt(value.getValue());
  }
}
