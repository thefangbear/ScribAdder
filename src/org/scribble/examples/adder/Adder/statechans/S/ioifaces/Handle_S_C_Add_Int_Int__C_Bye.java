package org.scribble.examples.adder.Adder.statechans.S.ioifaces;

import org.scribble.examples.adder.Adder.ops.*;

public interface Handle_S_C_Add_Int_Int__C_Bye<__Succ1 extends Succ_In_C_Add_Int_Int, __Succ2 extends Succ_In_C_Bye> extends Callback_C_Add_Int_Int<__Succ1>, Callback_C_Bye<__Succ2> {

	abstract public void receive(__Succ1 schan, Add op, org.scribble.runtime.util.Buf<java.lang.Integer> arg1, org.scribble.runtime.util.Buf<java.lang.Integer> arg2) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;

	abstract public void receive(__Succ2 schan, Bye op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;
}