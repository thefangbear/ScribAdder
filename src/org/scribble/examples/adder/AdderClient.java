package org.scribble.examples.adder;

import org.scribble.examples.adder.Adder.Adder;
import org.scribble.examples.adder.Adder.ops.Add;
import org.scribble.examples.adder.Adder.ops.Bye;
import org.scribble.examples.adder.Adder.ops.Res;
import org.scribble.examples.adder.Adder.roles.C;
import org.scribble.examples.adder.Adder.roles.S;
import org.scribble.examples.adder.Adder.statechans.C.Adder_C_1;
import org.scribble.examples.adder.Adder.statechans.C.Adder_C_2;
import org.scribble.examples.adder.Adder.statechans.C.EndSocket;
import org.scribble.main.ScribRuntimeException;
import org.scribble.runtime.message.ObjectStreamFormatter;
import org.scribble.runtime.net.SocketChannelEndpoint;
import org.scribble.runtime.session.MPSTEndpoint;
import org.scribble.runtime.util.Buf;

import java.io.*;

public class AdderClient {

    private Adder adder;
    private String addr;
    private MPSTEndpoint<Adder, C> client;
    private int port;

    public AdderClient(String addr, int port) throws IOException, ScribRuntimeException {
        this.adder = new Adder();
        this.addr = addr;
        this.client = new MPSTEndpoint<>(adder, C.C, new ObjectStreamFormatter());
        this.port = port;
    }

    public Adder_C_1 connect() throws IOException, ScribRuntimeException {
        this.client.request(S.S, SocketChannelEndpoint::new, addr, port);
        return new Adder_C_1(this.client);
    }

    public MPSTEndpoint<Adder, C> getClient() { return this.client; }

    public Adder_C_2 add(Adder_C_1 c1, int a, int b) throws ScribRuntimeException, IOException {
        return c1.send(S.S, Add.Add, (Integer)a, (Integer)b);
    }

    public EndSocket terminate(Adder_C_1 c1) throws ScribRuntimeException, IOException {
        return c1.send(S.S, Bye.Bye);
    }

    public static void main(String[] args) throws Exception {
        AdderClient client = new AdderClient(args[0], Integer.parseInt(args[1]));
        Adder_C_1 SEND;
        Adder_C_2 RECV;
        BufferedReader IN = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter OUT = new PrintWriter(new OutputStreamWriter(System.out));
        String[] inputs;

        System.out.println("AdderClient: Successfully instantiated.");
        SEND = client.connect();
        System.out.println("AdderClient: Successfully connected to server.");
        repl: while (true) {
            inputs = IN.readLine().split(" ");
            switch (inputs.length) {
                case 1:
                    if (inputs[0].equals("exit") || inputs[0].equals("quit")) {
                        client.terminate(SEND);
                        break repl;
                    }
                case 2: {
                    try {
                        int a = Integer.parseInt(inputs[0]), b = Integer.parseInt(inputs[1]);
                        Buf<Integer> iBuf = new Buf<>();
                        RECV = client.add(SEND, a, b);
                        SEND = RECV.receive(S.S, Res.Res, iBuf);
                        System.out.println("res := " + iBuf.val);
                        continue;
                    } catch (Exception ignored) {}
                }
                default:
                    System.out.println("AdderClient: Command not found");
            }
        }
    }
}
