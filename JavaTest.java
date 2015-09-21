import java.io.*;

class Base{
	public void display(){
		System.out.println("Base display");
	}	
}

class Derive extends Base{

	public void display(){
		System.out.println("Derive display");
	}
}

public class JavaTest{
	public static void main(String[] args){
		Base b = new Base();
		b.display();
		Base bd = new Derive();
		bd.display();
	}
}
