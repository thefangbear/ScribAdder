package org.scribble.examples.adder.Adder.statechans.C;

import java.io.IOException;
import java.util.concurrent.CompletableFuture;

public class Adder_C_2_Future extends org.scribble.runtime.util.ScribFuture {
	public java.lang.Integer pay1;

	protected Adder_C_2_Future(CompletableFuture<org.scribble.runtime.message.ScribMessage> fut) {
		super(fut);
	}

	public Adder_C_2_Future sync() throws IOException {
		org.scribble.runtime.message.ScribMessage m = super.get();
		this.pay1 = (java.lang.Integer) m.payload[0];
		return this;
	}
}