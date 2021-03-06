package com.biosimilarity.lift.lib.term.Prolog.Absyn; // Java Package generated by the BNF Converter.

public class StrAtm extends Atom {
  public final String string_;

  public StrAtm(String p1) { string_ = p1; }

  public <R,A> R accept(com.biosimilarity.lift.lib.term.Prolog.Absyn.Atom.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof com.biosimilarity.lift.lib.term.Prolog.Absyn.StrAtm) {
      com.biosimilarity.lift.lib.term.Prolog.Absyn.StrAtm x = (com.biosimilarity.lift.lib.term.Prolog.Absyn.StrAtm)o;
      return this.string_.equals(x.string_);
    }
    return false;
  }

  public int hashCode() {
    return this.string_.hashCode();
  }


}
