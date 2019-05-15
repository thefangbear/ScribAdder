package org.scribble.examples.adder.Adder.statechans.S.ioifaces;

import java.io.IOException;
import org.scribble.examples.adder.Adder.*;
import org.scribble.examples.adder.Adder.roles.*;
import org.scribble.examples.adder.Adder.ops.*;

public interface Out_C_Res_Int<__Succ extends Succ_Out_C_Res_Int> {

	abstract public __Succ send(C role, Res op, java.lang.Integer arg0) throws org.scribble.main.ScribRuntimeException, IOException;
}