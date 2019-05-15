package org.scribble.examples.adder.Adder.statechans.C;

import org.scribble.examples.adder.Adder.*;
import org.scribble.examples.adder.Adder.roles.*;
import org.scribble.examples.adder.Adder.statechans.C.ioifaces.*;

public final class EndSocket extends org.scribble.runtime.statechans.EndSocket<Adder, C> implements Succ_Out_S_Bye {
	public static final EndSocket cast = null;

	protected EndSocket(org.scribble.runtime.session.SessionEndpoint<Adder, C> se, boolean dummy) {
		super(se);
	}

	@Override
	public EndSocket to(EndSocket cast) {
		return (EndSocket) this;
	}
}