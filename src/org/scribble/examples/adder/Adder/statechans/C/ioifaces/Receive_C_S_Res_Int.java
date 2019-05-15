package org.scribble.examples.adder.Adder.statechans.C.ioifaces;

import org.scribble.examples.adder.Adder.roles.*;
import org.scribble.examples.adder.Adder.ops.*;
import org.scribble.examples.adder.Adder.statechans.C.*;

public interface Receive_C_S_Res_Int<__Succ1 extends Succ_In_S_Res_Int> extends In_S_Res_Int<__Succ1>, Succ_Out_S_Add_Int_Int {
	public static final Receive_C_S_Res_Int<?> cast = null;

	abstract public __Succ1 async(S role, Res op) throws org.scribble.main.ScribRuntimeException;

	@Override
	default Receive_C_S_Res_Int<?> to(Receive_C_S_Res_Int<?> cast) {
		return (Receive_C_S_Res_Int<?>) this;
	}

	default Adder_C_2 to(Adder_C_2 cast) {
		return (Adder_C_2) this;
	}
}