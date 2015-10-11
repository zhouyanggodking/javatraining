package springsample;

public class Address {
	private String postalCode;
	private String street;
	
	public void setPostalCode(String postalCode){
		this.postalCode = postalCode;
	}
	
	public String getPostalCode(){
		return this.postalCode;
	}
	
	public void setStreet(String street){
		this.street = street;
	}
	
	public String getStreet(){
		return this.street;
	}
	
	@Override
	public String toString(){
		return this.postalCode + " : "+ this.street;
	}

}
