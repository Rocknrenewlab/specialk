package com.biosimilarity.lift.lib.amqpJSONAPI2.Absyn; // Java Package generated by the BNF Converter.

public abstract class RspHeader implements java.io.Serializable {
  public abstract <R,A> R accept(RspHeader.Visitor<R,A> v, A arg);
  public interface Visitor <R,A> {
    public R visit(com.biosimilarity.lift.lib.amqpJSONAPI2.Absyn.KVDBRspHdr p, A arg);
    public R visit(com.biosimilarity.lift.lib.amqpJSONAPI2.Absyn.KVDBRspNoHdr p, A arg);
    public R visit(com.biosimilarity.lift.lib.amqpJSONAPI2.Absyn.KVDBRspURIHdr p, A arg);
    public R visit(com.biosimilarity.lift.lib.amqpJSONAPI2.Absyn.KVDBRspUUIDHdr p, A arg);

  }

}
