package org.scribble.examples.adder.Adder.statechans.S.ioifaces;

import org.scribble.examples.adder.Adder.roles.*;
import org.scribble.examples.adder.Adder.statechans.S.*;

public interface Branch_S_C_Add_Int_Int__C_Bye<__Succ1 extends Succ_In_C_Add_Int_Int, __Succ2 extends Succ_In_C_Bye> extends Succ_Out_C_Res_Int {
	public static final Branch_S_C_Add_Int_Int__C_Bye<?, ?> cast = null;

	abstract Case_S_C_Add_Int_Int__C_Bye<__Succ1, __Succ2> branch(C role) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;

	abstract void branch(C role, Handle_S_C_Add_Int_Int__C_Bye<__Succ1, __Succ2> handler) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;

	abstract void handle(C role, Handle_S_C_Add_Int_Int__C_Bye<Succ_In_C_Add_Int_Int, Succ_In_C_Bye> handler) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;

	@Override
	default Branch_S_C_Add_Int_Int__C_Bye<?, ?> to(Branch_S_C_Add_Int_Int__C_Bye<?, ?> cast) {
		return (Branch_S_C_Add_Int_Int__C_Bye<?, ?>) this;
	}

	default Adder_S_1 to(Adder_S_1 cast) {
		return (Adder_S_1) this;
	}

public enum Branch_S_C_Add_Int_Int__C_Bye_Enum implements org.scribble.runtime.session.OpEnum {
	Add, Bye
}
}