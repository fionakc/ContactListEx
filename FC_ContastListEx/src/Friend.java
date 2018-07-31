import ecs100.*;

public class Friend extends Contact{

	private String bday; //maybe need to ensure consistant formatting?
		
	
	public Friend() {
		super(); //uses common contact constructor
		this.bday=UI.askString("What is their birthday? "); //also asks birthday
		
	}
	
	public Friend(String na, String num, String em, String ad, String bd) {
		super(na, num, em, ad);
		this.bday=bd;
	}
	
	public void fullInfo() {
		UI.println("Name: "+this.getName());
		UI.println("Number: "+this.getNumber());
		UI.println("Email: "+this.getEmail());
		UI.println("Address: "+this.getAddy());
		UI.println("Birthday: "+this.bday);
		
		
	}

	
	
}
