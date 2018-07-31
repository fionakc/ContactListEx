import java.util.ArrayList;
import java.io.*;
import java.util.Scanner;

public class Contact {

	//variables
	private String name;
	private String number; //because may need the zeros on the front
	private String email;
	private String addy;
	private String bday; //maybe need to ensure consistant formatting?
	private String gstnum;
	private ArrayList<String> employers;
	private ArrayList<String> employees;
	private ArrayList<String> relationships;
	private ArrayList<String> notes; 
	
	public Contact() {
		
	}
	
	public void newContact() {
		System.out.print("What is their name? ");
		Scanner scan=new Scanner (System.in);
		this.name=scan.next();
		
		System.out.print("What is their number? ");
		scan=new Scanner (System.in);
		this.number=scan.next();
		
		System.out.print("What is their email? ");
		scan=new Scanner (System.in);
		this.email=scan.next();
		
		System.out.print("What is their postal address? ");
		scan=new Scanner (System.in);
		this.addy=scan.next();
		
		System.out.print("What is their birthday? ");
		scan=new Scanner (System.in);
		this.bday=scan.next();

		System.out.print("What is their gstNum ");
		scan=new Scanner (System.in);
		this.gstnum=scan.next();
		
		scan.close();
		System.out.println(this.name+" has been added to the contact list");
	}

	
	//=================getters and setters =====================================
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddy() {
		return addy;
	}

	public void setAddy(String addy) {
		this.addy = addy;
	}

	public String getBday() {
		return bday;
	}

	public void setBday(String bday) {
		this.bday = bday;
	}

	public String getGstnum() {
		return gstnum;
	}

	public void setGstnum(String gstnum) {
		this.gstnum = gstnum;
	}

	public ArrayList<String> getEmployers() {
		return employers;
	}

	public void setEmployers(ArrayList<String> employers) {
		this.employers = employers;
	}

	public ArrayList<String> getEmployees() {
		return employees;
	}

	public void setEmployees(ArrayList<String> employees) {
		this.employees = employees;
	}

	public ArrayList<String> getRelationships() {
		return relationships;
	}

	public void setRelationships(ArrayList<String> relationships) {
		this.relationships = relationships;
	}

	public ArrayList<String> getNotes() {
		return notes;
	}

	public void setNotes(ArrayList<String> notes) {
		this.notes = notes;
	}
	
	
	
} //end class
