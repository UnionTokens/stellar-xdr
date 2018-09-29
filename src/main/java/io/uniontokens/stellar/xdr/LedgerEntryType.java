// Automatically generated by xdrgen
// DO NOT EDIT or your changes may be overwritten

package io.uniontokens.stellar.xdr;


import java.io.IOException;

// === xdr source ============================================================

//  enum LedgerEntryType
//  {
//      ACCOUNT = 0,
//      TRUSTLINE = 1,
//      OFFER = 2,
//      DATA = 3
//  };

//  ===========================================================================
public enum LedgerEntryType  {
  ACCOUNT(0),
  TRUSTLINE(1),
  OFFER(2),
  DATA(3),
  ;
  private int mValue;

  LedgerEntryType(int value) {
      mValue = value;
  }

  public int getValue() {
      return mValue;
  }

  static LedgerEntryType decode(XdrDataInputStream stream) throws IOException {
    int value = stream.readInt();
    switch (value) {
      case 0: return ACCOUNT;
      case 1: return TRUSTLINE;
      case 2: return OFFER;
      case 3: return DATA;
      default:
        throw new RuntimeException("Unknown enum value: " + value);
    }
  }

  static void encode(XdrDataOutputStream stream, LedgerEntryType value) throws IOException {
    stream.writeInt(value.getValue());
  }
}
