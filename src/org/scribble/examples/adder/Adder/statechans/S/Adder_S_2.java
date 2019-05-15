package org.scribble.examples.adder.Adder.statechans.S;

import java.io.IOException;
import org.scribble.examples.adder.Adder.*;
import org.scribble.examples.adder.Adder.roles.*;
import org.scribble.examples.adder.Adder.ops.*;
import org.scribble.examples.adder.Adder.statechans.S.ioifaces.*;

public final class Adder_S_2 extends org.scribble.runtime.statechans.OutputSocket<Adder, S> implements Select_S_C_Res_Int<Adder_S_1> {
	public static final Adder_S_2 cast = null;

	protected Adder_S_2(org.scribble.runtime.session.SessionEndpoint<Adder, S> se, boolean dummy) {
		super(se);
	}

	public Adder_S_1 send(C role, Res op, java.lang.Integer arg0) throws org.scribble.main.ScribRuntimeException, IOException {
		super.writeScribMessage(role, Adder.Res, arg0);

		return new Adder_S_1(this.se, true);
	}
}