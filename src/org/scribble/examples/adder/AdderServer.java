package org.scribble.examples.adder;

import org.scribble.examples.adder.Adder.Adder;
import org.scribble.examples.adder.Adder.ops.Bye;
import org.scribble.examples.adder.Adder.ops.Res;
import org.scribble.examples.adder.Adder.roles.C;
import org.scribble.examples.adder.Adder.roles.S;
import org.scribble.examples.adder.Adder.statechans.S.Adder_S_1;
import org.scribble.examples.adder.Adder.statechans.S.Adder_S_1_Cases;
import org.scribble.main.ScribRuntimeException;
import org.scribble.runtime.message.ObjectStreamFormatter;
import org.scribble.runtime.net.SocketChannelServer;
import org.scribble.runtime.session.MPSTEndpoint;
import org.scribble.runtime.util.Buf;

import java.io.IOException;

import static org.scribble.examples.adder.Adder.Adder.Add;

public class AdderServer {

    int port;
    private Adder adder;
    MPSTEndpoint<Adder, S> server;
    public AdderServer(int port) throws IOException, ScribRuntimeException {
        this.port = port;
        this.adder = new Adder();
        this.server = new MPSTEndpoint<>(adder, S.S, new ObjectStreamFormatter());
    }

    Adder_S_1 accept() throws IOException, ScribRuntimeException {
        server.accept(new SocketChannelServer(port), C.C)
        return new Adder_S_1(server);

    }

    private void run(Adder_S_1 s1) throws ScribRuntimeException, IOException, ClassNotFoundException {
        Buf<Integer> x = new Buf<>();
        Buf<Integer> y = new Buf<>();
        while (true) {
            Adder_S_1_Cases cases = s1.branch(C.C);
            switch (cases.op) {
                case Add:
                    s1 = cases.receive(Add, x, y)
                        .send(C.C, Res.Res, x.val+y.val);
                    break;
                case Bye: cases.receive(Bye.Bye);
                return;
            }
        }
    }

    public static void main(String[] args) {

    }
}
