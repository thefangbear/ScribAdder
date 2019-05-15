package org.scribble.examples.adder.Adder.statechans.S.ioifaces;

import org.scribble.examples.adder.Adder.ops.*;

public interface Case_S_C_Add_Int_Int__C_Bye<__Succ1 extends Succ_In_C_Add_Int_Int, __Succ2 extends Succ_In_C_Bye> extends In_C_Add_Int_Int<__Succ1>, In_C_Bye<__Succ2> {
	public static final Branch_S_C_Add_Int_Int__C_Bye<?, ?> cast = null;

	abstract Branch_S_C_Add_Int_Int__C_Bye.Branch_S_C_Add_Int_Int__C_Bye_Enum getOp();

	abstract public __Succ1 receive(Add op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;

	abstract public org.scribble.examples.adder.Adder.statechans.S.EndSocket receive(Bye op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;
}