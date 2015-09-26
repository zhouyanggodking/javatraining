package springsample;

public class Person {
	private String name;
	private String title;
	
	public Person(String name, String title){
		this.name = name;
		this.title = title;
	}
	
	//setter function
//	public void setName(String name){
//		this.name = name;
//	}
	
	public String getName(){
		return this.name;
	}
	
	public String getTitle(){
		return this.title;
	}
}
