import java.io.*;
import java.util.*;
class Store<T, S>{
	HashMap<T, S> keyValues = new HashMap<T,S>();
	void put(T t, S s){
		keyValues.put(t,s);
	}
	void display(){
		for ( T t: keyValues.keySet()){
			System.out.println(t + ": "+keyValues.get(t));
		}
	}
}

public class JavaGeneric{
	public static <T> void display(T t){
		System.out.println(t);
	}

	public static void main(String[] args){
		display(4);
		Store<String, String> dic = new Store<String, String>();
		dic.put("one", "1");
		dic.put("two", "2");
		dic.put("three", "3");
		dic.display();	
	}
}
