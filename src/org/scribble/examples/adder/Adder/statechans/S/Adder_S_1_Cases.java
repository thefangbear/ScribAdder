package org.scribble.examples.adder.Adder.statechans.S;

import org.scribble.examples.adder.Adder.*;
import org.scribble.examples.adder.Adder.roles.*;
import org.scribble.examples.adder.Adder.ops.*;
import org.scribble.examples.adder.Adder.statechans.S.ioifaces.*;

public final class Adder_S_1_Cases extends org.scribble.runtime.statechans.CaseSocket<Adder, S> implements Case_S_C_Add_Int_Int__C_Bye<Adder_S_2, EndSocket> {
	public static final Adder_S_1_Cases cast = null;
	public final Adder_S_1.Branch_S_C_Add_Int_Int__C_Bye_Enum op;
	private final org.scribble.runtime.message.ScribMessage m;

	protected Adder_S_1_Cases(org.scribble.runtime.session.SessionEndpoint<Adder, S> se, boolean dummy, Adder_S_1.Branch_S_C_Add_Int_Int__C_Bye_Enum op, org.scribble.runtime.message.ScribMessage m) {
		super(se);
		this.op = op;
		this.m = m;
	}

	public Adder_S_2 receive(C role, Add op, org.scribble.runtime.util.Buf<? super java.lang.Integer> arg1, org.scribble.runtime.util.Buf<? super java.lang.Integer> arg2) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException {
		super.use();
		if (!this.m.op.equals(Adder.Add)) {
			throw new org.scribble.main.ScribRuntimeException("Wrong branch, received: " + this.m.op);
		}
		arg1.val = (java.lang.Integer) m.payload[0];
		arg2.val = (java.lang.Integer) m.payload[1];
		return new Adder_S_2(this.se, true);
	}

	public Adder_S_2 receive(Add op, org.scribble.runtime.util.Buf<? super java.lang.Integer> arg1, org.scribble.runtime.util.Buf<? super java.lang.Integer> arg2) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException {
		return receive(Adder.C, op, arg1, arg2);
	}

	@SuppressWarnings("unchecked")
	public Adder_S_2 receive(Add op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException {
		return receive(op, (org.scribble.runtime.util.Buf<java.lang.Integer>) this.se.gc, (org.scribble.runtime.util.Buf<java.lang.Integer>) this.se.gc);
	}

	public org.scribble.examples.adder.Adder.statechans.S.EndSocket receive(C role, Bye op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException {
		super.use();
		if (!this.m.op.equals(Adder.Bye)) {
			throw new org.scribble.main.ScribRuntimeException("Wrong branch, received: " + this.m.op);
		}
		this.se.setCompleted();
		return new EndSocket(this.se, true);
	}

	public org.scribble.examples.adder.Adder.statechans.S.EndSocket receive(Bye op) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException {
		return receive(Adder.C, op);
	}

	@Override
	public Branch_S_C_Add_Int_Int__C_Bye.Branch_S_C_Add_Int_Int__C_Bye_Enum getOp() {
		return this.op;
	}
}