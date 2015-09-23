import java.io.*;
import java.net.*;

public class SocketClient{
	public static void main(String[] args){
		int port = 9999;
		String serverName = "localhost";
		try{
			System.out.println("connecting to " + serverName + " : " + port);
			Socket clientSocket = new Socket(serverName, port);
			System.out.println("Just connected to " + clientSocket.getRemoteSocketAddress());
			
			DataOutputStream out = new DataOutputStream(clientSocket.getOutputStream());
			out.writeUTF("I am coming");

			DataInputStream in = new DataInputStream(clientSocket.getInputStream());
			System.out.println("message from server: " + in.readUTF());
		
			clientSocket.close();			
	
		}catch(IOException i){
			i.printStackTrace();
		}
		
	}
}
