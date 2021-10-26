package main;
public class Passenger {
	String name;
	int age;
	String address;
	String gender;
	String passportNumber;
	
	
	public Passenger() {
		this.name = "";
		this.address = "";
		this.gender = "";
		this.age = 0;
		this.passportNumber = "";
	}
	
	public Passenger(String name, String address,String gender, int age, String passportNumber) throws InvalidInformationException {
		if(name.length()>100 || age<0 || gender==null) {
			throw new InvalidInformationException("Invalid Credentials");
		}
		this.name = name;
		this.address = address;
		this.gender = gender;
		this.age = age;
		this.passportNumber = passportNumber;
	}
	
	public String getName() {
		return name;
	}	
	
}
