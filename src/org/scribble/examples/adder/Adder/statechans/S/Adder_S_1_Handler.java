package org.scribble.examples.adder.Adder.statechans.S;

import org.scribble.examples.adder.Adder.ops.*;
import org.scribble.examples.adder.Adder.*;
import org.scribble.examples.adder.Adder.roles.*;
import org.scribble.examples.adder.Adder.statechans.S.ioifaces.*;

public interface Adder_S_1_Handler extends Handle_S_C_Add_Int_Int__C_Bye<Adder_S_2, EndSocket> {

	@Override
	abstract public void receive(Adder_S_2 schan, Add op, org.scribble.runtime.util.Buf<java.lang.Integer> arg1, org.scribble.runtime.util.Buf<java.lang.Integer> arg2) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;

	@Override
	abstract public void receive(EndSocket schan, Bye op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;
}