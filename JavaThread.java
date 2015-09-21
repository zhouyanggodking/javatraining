import java.lang.*;
import java.io.*;
class Counting{
	private int c = 0;
	private  Object  obj = new Object();	

	public  void count(String name){
		System.out.println("counting");
		try{
			for(int i = 0; i < 100; ++i){
			
			synchronized(obj){
				++c;
			
			System.out.println("From: " + name + " Num: "+ c);	
			}
			Thread.sleep(1);
			}
			
		
		}catch(InterruptedException i){
			i.printStackTrace();
		}
	}

}

//counting thread wrapper
class CountingThread extends Thread{
	private Counting count;
	private String name;
	
	CountingThread(String name, Counting count){
		this.name = name;
		this.count = count;
	}
	@Override
	public void run(){
		count.count(name);	
	}
}

public class JavaThread{
	public static void main(String[] args){
		Counting counter = new Counting();
		CountingThread thread1 = new CountingThread("Thread1", counter);			
		CountingThread thread2 = new CountingThread("Thread2", counter);
		thread1.start();
		thread2.start();			
	}
}
