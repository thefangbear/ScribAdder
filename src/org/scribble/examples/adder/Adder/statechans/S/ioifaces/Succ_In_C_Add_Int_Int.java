package org.scribble.examples.adder.Adder.statechans.S.ioifaces;

public interface Succ_In_C_Add_Int_Int {

	default Select_S_C_Res_Int<?> to(Select_S_C_Res_Int<?> cast) {
		return (Select_S_C_Res_Int<?>) this;
	}
}