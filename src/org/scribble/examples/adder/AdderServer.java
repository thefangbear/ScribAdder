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
    MPSTEndpoint<Adder, S> server;
    SocketChannelServer socket;
    public AdderServer(int port) throws IOException, ScribRuntimeException {
        this.port = port;
        this.server = new MPSTEndpoint<>(new Adder(), S.S, new ObjectStreamFormatter());
    }

    public Adder_S_1 accept() throws IOException, ScribRuntimeException {
        this.socket = new SocketChannelServer(port);
        server.accept(socket, C.C);
        return new Adder_S_1(server);

    }

    public void run(Adder_S_1 s1) throws ScribRuntimeException, IOException, ClassNotFoundException {
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

    public void disconnect() throws IOException, ScribRuntimeException {
        this.server.disconnect(C.C);
        this.socket.close();
    }

    public static void main(String[] args) throws Exception {
        System.out.println("AdderServer: Starting...");
        while (true) {
            AdderServer server = new AdderServer(Integer.parseInt(args[0]));
            System.out.println("AdderServer: Successfully instantiated at port " + args[0]);
            Adder_S_1 s1 = server.accept();
            System.out.println("AdderServer: Accepted (1) connection.");
            server.run(s1);
            server.disconnect();
            System.out.println("AdderServer: Served (1) connection. Repeating...");
        }
    }
}
