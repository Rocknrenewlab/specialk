package com.biosimilarity.lift.lib.amqpJSONAPI2.Absyn; // Java Package generated by the BNF Converter.

public abstract class DNSElement implements java.io.Serializable {
  public abstract <R,A> R accept(DNSElement.Visitor<R,A> v, A arg);
  public interface Visitor <R,A> {
    public R visit(com.biosimilarity.lift.lib.amqpJSONAPI2.Absyn.AtomDNSElement p, A arg);

  }

}
