package org.scribble.examples.adder.Adder.statechans.C.ioifaces;

import java.io.IOException;
import org.scribble.examples.adder.Adder.*;
import org.scribble.examples.adder.Adder.roles.*;
import org.scribble.examples.adder.Adder.ops.*;

public interface Out_S_Add_Int_Int<__Succ extends Succ_Out_S_Add_Int_Int> {

	abstract public __Succ send(S role, Add op, java.lang.Integer arg0, java.lang.Integer arg1) throws org.scribble.main.ScribRuntimeException, IOException;
}