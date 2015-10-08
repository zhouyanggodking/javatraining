package springsample;

public class Person {
	private String name;
	private String title;
	private Address address;
	
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
	
	/*public void setTitle(String title){
		this.title = title;
	}*/
	
	public String getTitle(){
		return this.title;
	}
	
	public void setAddress(Address addr){
		this.address = addr;
	}
	
	public Address getAddress(){
		return this.address;
	}
	
	//bean life cycle
	public void init(){
		System.out.println("Person(" + this.name +"," + this.title+") created");		
	}
	
	public void destroy(){
		System.out.println("Person(" + this.name +"," + this.title+") will be destroyed");	
	}
}
