package com.biosimilarity.lift.lib.amqpJSONAPI2.Absyn; // Java Package generated by the BNF Converter.

public class QVar extends QryElem {
  public final String varuident_;

  public QVar(String p1) { varuident_ = p1; }

  public <R,A> R accept(com.biosimilarity.lift.lib.amqpJSONAPI2.Absyn.QryElem.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof com.biosimilarity.lift.lib.amqpJSONAPI2.Absyn.QVar) {
      com.biosimilarity.lift.lib.amqpJSONAPI2.Absyn.QVar x = (com.biosimilarity.lift.lib.amqpJSONAPI2.Absyn.QVar)o;
      return this.varuident_.equals(x.varuident_);
    }
    return false;
  }

  public int hashCode() {
    return this.varuident_.hashCode();
  }


}
