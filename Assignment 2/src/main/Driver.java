package main;
import java.io.*;
import java.util.*;  


public class Driver {
	
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		Passenger p1 = new Passenger();
		System.out.println("Enter your details");
		System.out.print("Name: ");
		String name = sc.nextLine();    
		System.out.print("Name: ");
		String address = sc.nextLine(); 
		System.out.print("Name: ");
		String gender = sc.nextLine(); 
		System.out.print("Name: ");
		int age = sc.nextInt();
		System.out.print("Name: ");
		String passport = sc.nextLine(); 
		
		System.out.print("Your Details: "+name+" "+address+" "+gender+" "+age+" "+passport);
		Flight f1 = new Flight("Islamabad", "Lahore", "11:00pm", 1,"6:00am","27-5-2021", 2254);
		
		try {
		Passenger p2 = new Passenger(name, address, gender, age, passport);
		}
		catch(InvalidInformationException e) {
			System.out.println("Credentials exception caught");
			System.out.println("Exception: "+ e);
		}
	}

}
