package com.biosimilarity.seleKt.model.ill.vm.illvm.Absyn; // Java Package generated by the BNF Converter.

public class MAKEOCL extends Instruction {
  public final ILLCode illcode_;

  public MAKEOCL(ILLCode p1) { illcode_ = p1; }

  public <R,A> R accept(com.biosimilarity.seleKt.model.ill.vm.illvm.Absyn.Instruction.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof com.biosimilarity.seleKt.model.ill.vm.illvm.Absyn.MAKEOCL) {
      com.biosimilarity.seleKt.model.ill.vm.illvm.Absyn.MAKEOCL x = (com.biosimilarity.seleKt.model.ill.vm.illvm.Absyn.MAKEOCL)o;
      return this.illcode_.equals(x.illcode_);
    }
    return false;
  }

  public int hashCode() {
    return this.illcode_.hashCode();
  }


}