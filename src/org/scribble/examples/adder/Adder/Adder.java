package org.scribble.examples.adder.Adder;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import org.scribble.core.type.name.Role;
import org.scribble.examples.adder.Adder.roles.*;
import org.scribble.examples.adder.Adder.ops.*;

public final class Adder extends org.scribble.runtime.session.Session {
	public static final List<String> IMPATH = new LinkedList<>();
	public static final String SOURCE = "getSource";
	public static final org.scribble.core.type.name.GProtoName PROTO = org.scribble.core.type.session.STypeFactory.parseGlobalProtocolName("org.scribble.examples.adder.Adder");
	public static final C C = org.scribble.examples.adder.Adder.roles.C.C;
	public static final S S = org.scribble.examples.adder.Adder.roles.S.S;
	public static final Bye Bye = org.scribble.examples.adder.Adder.ops.Bye.Bye;
	public static final Add Add = org.scribble.examples.adder.Adder.ops.Add.Add;
	public static final Res Res = org.scribble.examples.adder.Adder.ops.Res.Res;
	public static final List<Role> ROLES = Collections.unmodifiableList(Arrays.asList(new Role[] {C, S}));

	public Adder() {
		super(Adder.IMPATH, Adder.SOURCE, Adder.PROTO);
	}

	@Override
	public List<Role> getRoles() {
		return Adder.ROLES;
	}
}