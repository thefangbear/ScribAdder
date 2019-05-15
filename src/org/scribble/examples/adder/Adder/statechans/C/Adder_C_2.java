package org.scribble.examples.adder.Adder.statechans.C;

import org.scribble.examples.adder.Adder.*;
import org.scribble.examples.adder.Adder.roles.*;
import org.scribble.examples.adder.Adder.ops.*;
import org.scribble.examples.adder.Adder.statechans.C.ioifaces.*;

public final class Adder_C_2 extends org.scribble.runtime.statechans.ReceiveSocket<Adder, C> implements Receive_C_S_Res_Int<Adder_C_1> {
	public static final Adder_C_2 cast = null;

	protected Adder_C_2(org.scribble.runtime.session.SessionEndpoint<Adder, C> se, boolean dummy) {
		super(se);
	}

	public Adder_C_1 receive(S role, Res op, org.scribble.runtime.util.Buf<? super java.lang.Integer> arg1) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException {
		org.scribble.runtime.message.ScribMessage m = super.readScribMessage(Adder.S);
		arg1.val = (java.lang.Integer) m.payload[0];
		return new Adder_C_1(this.se, true);
	}

	public Adder_C_1 async(S role, Res op, org.scribble.runtime.util.Buf<Adder_C_2_Future> arg) throws org.scribble.main.ScribRuntimeException {
		arg.val = new Adder_C_2_Future(super.getFuture(Adder.S));
		return new Adder_C_1(this.se, true);
	}

	public boolean isDone() {
		return super.isDone(Adder.S);
	}

	@SuppressWarnings("unchecked")
	public Adder_C_1 async(S role, Res op) throws org.scribble.main.ScribRuntimeException {
		return async(Adder.S, op, (org.scribble.runtime.util.Buf<Adder_C_2_Future>) this.se.gc);
	}
}