package org.scribble.examples.adder.Adder.statechans.S;

import java.io.IOException;
import org.scribble.examples.adder.Adder.*;
import org.scribble.examples.adder.Adder.roles.*;
import org.scribble.examples.adder.Adder.statechans.S.ioifaces.*;

public final class Adder_S_1 extends org.scribble.runtime.statechans.BranchSocket<Adder, S> implements Branch_S_C_Add_Int_Int__C_Bye<Adder_S_2, EndSocket> {
	public static final Adder_S_1 cast = null;

	protected Adder_S_1(org.scribble.runtime.session.SessionEndpoint<Adder, S> se, boolean dummy) {
		super(se);
	}

	public Adder_S_1(org.scribble.runtime.session.MPSTEndpoint<Adder, S> se) throws org.scribble.main.ScribRuntimeException {
		super(se);
		se.init();
	}

	@Override
	public Adder_S_1_Cases branch(C role) throws org.scribble.main.ScribRuntimeException, IOException, ClassNotFoundException {
		org.scribble.runtime.message.ScribMessage m = super.readScribMessage(Adder.C);
		Branch_S_C_Add_Int_Int__C_Bye_Enum openum;
		if (m.op.equals(Adder.Add)) {
			openum = Branch_S_C_Add_Int_Int__C_Bye_Enum.Add;
		}
		else if (m.op.equals(Adder.Bye)) {
			openum = Branch_S_C_Add_Int_Int__C_Bye_Enum.Bye;
		}
		else {
			throw new RuntimeException("Won't get here: " + m.op);
		}
		return new Adder_S_1_Cases(this.se, true, openum, m);
	}

	public void branch(C role, Adder_S_1_Handler handler) throws org.scribble.main.ScribRuntimeException, IOException, ClassNotFoundException {
		branch(role, (Handle_S_C_Add_Int_Int__C_Bye<Adder_S_2, EndSocket>) handler);
	}

	@Override
	public void branch(C role, Handle_S_C_Add_Int_Int__C_Bye<Adder_S_2, EndSocket> handler) throws org.scribble.main.ScribRuntimeException, IOException, ClassNotFoundException {
		org.scribble.runtime.message.ScribMessage m = super.readScribMessage(Adder.C);
		if (m.op.equals(Adder.Add)) {
			handler.receive(new Adder_S_2(this.se, true), Adder.Add, new org.scribble.runtime.util.Buf<>((java.lang.Integer) m.payload[0]), new org.scribble.runtime.util.Buf<>((java.lang.Integer) m.payload[1]));
		}
		else
		if (m.op.equals(Adder.Bye)) {
			this.se.setCompleted();
			handler.receive(new EndSocket(this.se, true), Adder.Bye);
		}
		else {
			throw new RuntimeException("Won't get here: " + m.op);
		}
	}

	@Override
	public void handle(C role, Handle_S_C_Add_Int_Int__C_Bye<Succ_In_C_Add_Int_Int, Succ_In_C_Bye> handler) throws org.scribble.main.ScribRuntimeException, IOException, ClassNotFoundException {
		org.scribble.runtime.message.ScribMessage m = super.readScribMessage(Adder.C);
		if (m.op.equals(Adder.Add)) {
			handler.receive(new Adder_S_2(this.se, true), Adder.Add, new org.scribble.runtime.util.Buf<>((java.lang.Integer) m.payload[0]), new org.scribble.runtime.util.Buf<>((java.lang.Integer) m.payload[1]));
		}
		else
		if (m.op.equals(Adder.Bye)) {
			this.se.setCompleted();
			handler.receive(new EndSocket(this.se, true), Adder.Bye);
		}
		else {
			throw new RuntimeException("Won't get here: " + m.op);
		}
	}
}