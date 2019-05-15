package org.scribble.examples.adder.Adder.statechans.C.ioifaces;

import java.io.IOException;
import org.scribble.examples.adder.Adder.*;
import org.scribble.examples.adder.Adder.roles.*;
import org.scribble.examples.adder.Adder.ops.*;

public interface Out_S_Bye<__Succ extends Succ_Out_S_Bye> {

	abstract public __Succ send(S role, Bye op) throws org.scribble.main.ScribRuntimeException, IOException;
}