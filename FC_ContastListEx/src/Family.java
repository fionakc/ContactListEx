import ecs100.*;

public class Family extends Contact{

	private String bday;
	private String relationship;
	
	public Family() {
		super();
		this.relationship=UI.askString("What is their relationship? ");
		this.bday=UI.askString("What is their birthday? ");
		
	}
	
	public Family(String na, String num, String em, String ad, String rshp, String bd) {
		super(na, num, em, ad);
		this.relationship=rshp;
		this.bday=bd;
	}
	
}
