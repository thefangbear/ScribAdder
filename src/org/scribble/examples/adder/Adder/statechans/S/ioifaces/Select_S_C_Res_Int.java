package org.scribble.examples.adder.Adder.statechans.S.ioifaces;

import org.scribble.examples.adder.Adder.roles.*;
import org.scribble.examples.adder.Adder.statechans.S.*;

public interface Select_S_C_Res_Int<__Succ1 extends Succ_Out_C_Res_Int> extends Out_C_Res_Int<__Succ1>, Succ_In_C_Add_Int_Int {
	public static final Select_S_C_Res_Int<?> cast = null;

	@Override
	default Select_S_C_Res_Int<?> to(Select_S_C_Res_Int<?> cast) {
		return (Select_S_C_Res_Int<?>) this;
	}

	default Adder_S_2 to(Adder_S_2 cast) {
		return (Adder_S_2) this;
	}
}