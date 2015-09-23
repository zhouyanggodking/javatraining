import java.io.*;
import java.net.*;

class GreetingServer extends Thread{
	private ServerSocket serverSocket = null;
	public GreetingServer(int port) throws IOException{
		serverSocket = new ServerSocket(port);
	}

	@Override
	public void run(){
		while(true){
			try{
				System.out.println("listening on port: " + serverSocket.getLocalPort());
				Socket clientSocket = serverSocket.accept();
				System.out.println("connected to "+ clientSocket.getRemoteSocketAddress());
				DataInputStream in = new DataInputStream(clientSocket.getInputStream());

				System.out.println(in.readUTF());

				DataOutputStream out = new DataOutputStream(clientSocket.getOutputStream());

				out.writeUTF("Hello from socket server "+ clientSocket.getLocalSocketAddress());
				System.out.println(clientSocket.getLocalSocketAddress());
				System.out.println(serverSocket.getLocalSocketAddress());

				clientSocket.close();
			}catch(IOException e){
				e.printStackTrace();
			}
		}
	}
}

public class SocketServer{

	public static void main(String[] args){
		int port = 9999;
		try{
			Thread t = new GreetingServer(port);
			t.start();
		}catch(IOException i){
			i.printStackTrace();
		}		
	}
}
