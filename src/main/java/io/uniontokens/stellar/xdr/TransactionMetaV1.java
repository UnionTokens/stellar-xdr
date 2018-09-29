// Automatically generated by xdrgen
// DO NOT EDIT or your changes may be overwritten

package io.uniontokens.stellar.xdr;


import java.io.IOException;

// === xdr source ============================================================

//  struct TransactionMetaV1
//  {
//      LedgerEntryChanges txChanges; // tx level changes if any
//      OperationMeta operations<>; // meta for each operation
//  };

//  ===========================================================================
public class TransactionMetaV1  {
  public TransactionMetaV1 () {}
  private LedgerEntryChanges txChanges;
  public LedgerEntryChanges getTxChanges() {
    return this.txChanges;
  }
  public void setTxChanges(LedgerEntryChanges value) {
    this.txChanges = value;
  }
  private OperationMeta[] operations;
  public OperationMeta[] getOperations() {
    return this.operations;
  }
  public void setOperations(OperationMeta[] value) {
    this.operations = value;
  }
  public static void encode(XdrDataOutputStream stream, TransactionMetaV1 encodedTransactionMetaV1) throws IOException{
    LedgerEntryChanges.encode(stream, encodedTransactionMetaV1.txChanges);
    int operationssize = encodedTransactionMetaV1.getOperations().length;
    stream.writeInt(operationssize);
    for (int i = 0; i < operationssize; i++) {
      OperationMeta.encode(stream, encodedTransactionMetaV1.operations[i]);
    }
  }
  public static TransactionMetaV1 decode(XdrDataInputStream stream) throws IOException {
    TransactionMetaV1 decodedTransactionMetaV1 = new TransactionMetaV1();
    decodedTransactionMetaV1.txChanges = LedgerEntryChanges.decode(stream);
    int operationssize = stream.readInt();
    decodedTransactionMetaV1.operations = new OperationMeta[operationssize];
    for (int i = 0; i < operationssize; i++) {
      decodedTransactionMetaV1.operations[i] = OperationMeta.decode(stream);
    }
    return decodedTransactionMetaV1;
  }
}
