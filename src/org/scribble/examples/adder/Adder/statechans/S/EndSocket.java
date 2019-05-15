package org.scribble.examples.adder.Adder.statechans.S;

import org.scribble.examples.adder.Adder.*;
import org.scribble.examples.adder.Adder.roles.*;
import org.scribble.examples.adder.Adder.statechans.S.ioifaces.*;

public final class EndSocket extends org.scribble.runtime.statechans.EndSocket<Adder, S> implements Succ_In_C_Bye {
	public static final EndSocket cast = null;

	protected EndSocket(org.scribble.runtime.session.SessionEndpoint<Adder, S> se, boolean dummy) {
		super(se);
	}

	@Override
	public EndSocket to(EndSocket cast) {
		return (EndSocket) this;
	}
}