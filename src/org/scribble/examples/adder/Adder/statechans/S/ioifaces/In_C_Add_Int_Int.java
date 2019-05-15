package org.scribble.examples.adder.Adder.statechans.S.ioifaces;

import java.io.IOException;
import org.scribble.examples.adder.Adder.*;
import org.scribble.examples.adder.Adder.roles.*;
import org.scribble.examples.adder.Adder.ops.*;

public interface In_C_Add_Int_Int<__Succ extends Succ_In_C_Add_Int_Int> {

	abstract public __Succ receive(C role, Add op, org.scribble.runtime.util.Buf<? super java.lang.Integer> arg1, org.scribble.runtime.util.Buf<? super java.lang.Integer> arg2) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;
}