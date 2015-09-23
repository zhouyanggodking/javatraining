import java.io.*;
import java.lang.*;

class Chat{
	//client ready	
	private boolean conditionFlag = true;
	public synchronized void request(String msg){
		
		try{
			if(!conditionFlag){
						
			System.out.println("request wait");
				wait();
			}
		}catch(InterruptedException i){
			i.printStackTrace();
		}
		System.out.println(msg);
		notify();
		conditionFlag = false;	
		
	}

	public synchronized void response(String msg){
		
		try{
			if(conditionFlag){

				System.out.println("response wait");
				wait();	
			}
		}catch(InterruptedException i){
			i.printStackTrace();
		}
		System.out.println(msg);
		notify();
		conditionFlag = true;
	}	
}

class Client extends Thread{
	private Chat c;
	private String[] requests = {"Hi", "Who is this","How are you"};
	
	Client(Chat chat){
		this.c = chat;
	}
	public void run(){
		for(String r: requests){
			c.request(r);
		}		
	}	
}

class Server extends Thread{
	private Chat c;
	private String[] responses = {"Hi", "This is God King", "Fine"};
	
	Server(Chat chat){
		this.c = chat;
	}
	@Override
	public void run(){
		for( String r: responses){
			c.response(r);
		}
	}
}





public class JavaThreadCommunication{
	public static void main(String[] args){
		Chat chat = new Chat();
		Client c = new Client(chat);
		Server s = new Server(chat);
		c.start();
		s.start();
	}
}
