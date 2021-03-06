package com.biosimilarity.lift.lib.term.Prolog.Absyn; // Java Package generated by the BNF Converter.

public class FAtm extends Functor {
  public final String lident_;

  public FAtm(String p1) { lident_ = p1; }

  public <R,A> R accept(com.biosimilarity.lift.lib.term.Prolog.Absyn.Functor.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof com.biosimilarity.lift.lib.term.Prolog.Absyn.FAtm) {
      com.biosimilarity.lift.lib.term.Prolog.Absyn.FAtm x = (com.biosimilarity.lift.lib.term.Prolog.Absyn.FAtm)o;
      return this.lident_.equals(x.lident_);
    }
    return false;
  }

  public int hashCode() {
    return this.lident_.hashCode();
  }


}
