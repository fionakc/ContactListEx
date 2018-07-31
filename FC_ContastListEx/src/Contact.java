import java.util.ArrayList;
import java.io.*;
import java.util.Scanner;

import ecs100.UI;

public class Contact {

	//common variables
	protected String name;
	protected String number; //because may need the zeros on the front
	protected String email;
	protected String addy;
	//private String bday; //maybe need to ensure consistent formatting?
	//private String gstnum;
	//private ArrayList<String> employers;
	//private ArrayList<String> employees;
	//private ArrayList<String> relationships;
	protected ArrayList<String> notes; 
	
	public Contact() {
		this.name=UI.askString("What is their name? ");
		this.number=UI.askString("What is their number? ");
		this.setEmail(UI.askString("What is their email? "));
		this.setAddy(UI.askString("What is their address? "));
		
		//UI.println(this.name+" has been added to the contact list");
		
	}
	
	public Contact(String na, String num, String em, String ad) {
		this.name=na;
		this.number=num;
		this.setEmail(em);
		this.setAddy(ad);
	}
	
	public String toString() {
		UI.println("The contact "+this.name+" has the email "+this.getEmail());
		//System.out.println("");
		return null;
	}
	
	public void fullInfo() {
		UI.println("Name: "+this.name);
		UI.println("Number: "+this.number);
		UI.println("Email: "+this.getEmail());
		UI.println("Address: "+this.getAddy());
		
	}
	
	public void setName(String na) {
		this.name=na;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setNumber(String num) {
		this.number=num;
	}
	
	public String getNumber() {
		return this.number;
	}
	
	
	public void newContact() {
		this.name=UI.askString("What is their name? ");
		this.number=UI.askString("What is their number? ");
		this.setEmail(UI.askString("What is their email? "));
		this.setAddy(UI.askString("What is their address? "));
		
		UI.println(this.name+" has been added to the contact list");
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddy() {
		return this.addy;
	}

	public void setAddy(String addy) {
		this.addy = addy;
	}

	
	
} //end class
