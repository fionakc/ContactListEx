import java.util.ArrayList;
import ecs100.*;


public class ContactList {

	private ArrayList<Contact> contacts=new ArrayList<>();
	private double pressedX;
	private double pressedY;
	
	public ContactList() {
		UI.initialise();
		UI.setMouseListener(this::doMouse);
		UI.addButton("New Contact", this::addContact);
		UI.addTextField("Search for contact", this::findContact);
		UI.addTextField("Full contact info", this::fullInfo);
		UI.addButton("List all contact names", this::listContacts);
		UI.addButton("Change info", this::changeInfo);
		//UI.addTextField("check", this::listen);
		UI.addButton("Quit", UI::quit);
		
		addSampleData();
	}
	
//	public void listen(String word) {
//		findCon(word);
//	}
//	
//	public void findCon(String name) {
//		for(int i=0;i<contacts.size();i++) {
//			if(name.equalsIgnoreCase(contacts.get(i).getName())) {
//				contacts.get(i).toString();
//				break;
//			}
//		}
//	}
	
	public static void main(String[] args) {
		new ContactList();
	}
	
	public void addContact() {
		//UI.addButton("Friend? ", this::addFriend);
		String ans=UI.askString("What kind of contact? ");
		if(ans.equalsIgnoreCase("Friend")) {
			contacts.add(new Friend());
		} else if(ans.equalsIgnoreCase("Family")){
			contacts.add(new Family());
		}else {
			contacts.add(new Contact());
		}
//		Contact temp=new Contact();
//		temp.newContact();
//		contacts.add(temp);
	}
	
	public void doMouse(String mouseAction, double x, double y) {
		if(mouseAction.equals("pressed")) {
			this.pressedX=x;
			this.pressedY=y;
		}
	}

	public void findContact(String ans) {
		//String ans=UI.askString("Who do you want to find? ");
		for(int i=0;i<contacts.size();i++) {
			if(ans.equalsIgnoreCase(contacts.get(i).getName())) {
				contacts.get(i).toString();
				break;
			}
		}
	}
	
	public void fullInfo(String ans) {
		//String ans=UI.askString("Who do you want to find? ");
		for(int i=0;i<contacts.size();i++) {
			if(ans.equalsIgnoreCase(contacts.get(i).getName())) {
				contacts.get(i).fullInfo();
				break;
			}
		}
	}
	
	public void listContacts() {
		for(int i=0;i<contacts.size();i++) {
			UI.println(contacts.get(i).getName());
		}
	}
	
	public boolean inList(String name) {
		//boolean exists=false;
		for(int i=0;i<contacts.size();i++) {
			if(name.equalsIgnoreCase(contacts.get(i).getName())) {
				return true;
				
			}
		}
		return false;
	}
	
	public void changeInfo() {
		
	}
	
	//public Contact(String na, String num, String em, String ad) {
	public void addSampleData() {
		contacts.add(new Friend("abel","1","1@a","1 st","1/1"));
		contacts.add(new Family("bob","2","2@b","2 st","bairn","2/2"));
		contacts.add(new Contact("cain","3","3@c","3 st"));
		contacts.add(new Friend("dylan","4","4@d","4 st","4/4"));
		
	}
	
} //end class
