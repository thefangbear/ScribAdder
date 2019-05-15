package org.scribble.examples.adder.Adder.statechans.S.ioifaces;

import java.io.IOException;
import org.scribble.examples.adder.Adder.*;
import org.scribble.examples.adder.Adder.roles.*;
import org.scribble.examples.adder.Adder.ops.*;

public interface In_C_Bye<__Succ extends Succ_In_C_Bye> {

	abstract public __Succ receive(C role, Bye op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;
}