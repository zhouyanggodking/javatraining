import java.io.*;

class Employee implements Serializable{
	public String name;
	public int age;
	public transient String title;
	
	private String address = "king address";
	void display(){
		System.out.println(address);
	}
	
}

public class JavaSerialization{
	public static void main(String[] args){
		Employee e = new Employee();
		e.name ="godking";
		e.age =3;
		e.title ="engineer";
		try{
		FileOutputStream fileOut =
			new FileOutputStream("test.ser");
		ObjectOutputStream serializer = 
			new ObjectOutputStream(fileOut);
		serializer.writeObject(e);
		serializer.close();
		fileOut.close();
		}catch(IOException i){
			i.printStackTrace();
		}
		
		Employee eback = null;
		try{
			FileInputStream filein =
				new FileInputStream("test.ser");
			ObjectInputStream in = 
				new ObjectInputStream(filein);
			eback = (Employee)in.readObject();
			in.close();
			filein.close();
		}catch(IOException i){
		
		}catch(ClassNotFoundException c){
		
		}
		
		System.out.println(eback.name);
		System.out.println(eback.age);
		System.out.println(eback.title);
		eback.display();
	}

}
