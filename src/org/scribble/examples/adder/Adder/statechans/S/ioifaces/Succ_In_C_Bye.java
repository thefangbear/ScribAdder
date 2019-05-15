package org.scribble.examples.adder.Adder.statechans.S.ioifaces;

import org.scribble.examples.adder.Adder.statechans.S.EndSocket;

public interface Succ_In_C_Bye {

	default EndSocket to(EndSocket cast) {
		return (EndSocket) this;
	}
}