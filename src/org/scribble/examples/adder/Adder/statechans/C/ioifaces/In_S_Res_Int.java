package org.scribble.examples.adder.Adder.statechans.C.ioifaces;

import java.io.IOException;
import org.scribble.examples.adder.Adder.*;
import org.scribble.examples.adder.Adder.roles.*;
import org.scribble.examples.adder.Adder.ops.*;

public interface In_S_Res_Int<__Succ extends Succ_In_S_Res_Int> {

	abstract public __Succ receive(S role, Res op, org.scribble.runtime.util.Buf<? super java.lang.Integer> arg1) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;
}