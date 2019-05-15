package org.scribble.examples.adder.Adder.statechans.C;

import java.io.IOException;
import org.scribble.examples.adder.Adder.*;
import org.scribble.examples.adder.Adder.roles.*;
import org.scribble.examples.adder.Adder.ops.*;
import org.scribble.examples.adder.Adder.statechans.C.ioifaces.*;

public final class Adder_C_1 extends org.scribble.runtime.statechans.OutputSocket<Adder, C> implements Select_C_S_Add_Int_Int__S_Bye<Adder_C_2, EndSocket> {
	public static final Adder_C_1 cast = null;

	protected Adder_C_1(org.scribble.runtime.session.SessionEndpoint<Adder, C> se, boolean dummy) {
		super(se);
	}

	public Adder_C_1(org.scribble.runtime.session.MPSTEndpoint<Adder, C> se) throws org.scribble.main.ScribRuntimeException {
		super(se);
		se.init();
	}

	public Adder_C_2 send(S role, Add op, java.lang.Integer arg0, java.lang.Integer arg1) throws org.scribble.main.ScribRuntimeException, IOException {
		super.writeScribMessage(role, Adder.Add, arg0, arg1);

		return new Adder_C_2(this.se, true);
	}

	public org.scribble.examples.adder.Adder.statechans.C.EndSocket send(S role, Bye op) throws org.scribble.main.ScribRuntimeException, IOException {
		super.writeScribMessage(role, Adder.Bye);

		this.se.setCompleted();
		return new EndSocket(this.se, true);
	}
}