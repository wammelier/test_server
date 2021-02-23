package test_server;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class NettyConfig {

	public static void main(final String[] args) throws UnknownHostException, IOException {
		Socket						socket			= new Socket("localhost", 90);
		DataOutputStream	outToServer	= new DataOutputStream(socket.getOutputStream());

		outToServer.writeBytes("Hello Camel\n");

		socket.close();

	}

}
