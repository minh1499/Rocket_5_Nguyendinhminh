package assignment4;

import java.util.ArrayList;

public abstract class Phone {
	
	private ArrayList<String> contacts;
	private String name;
	private String number;
	
	public Phone() {
		contacts=new ArrayList<String>();
	}
	
	public void Phone(String name,String number) {
		this.name=name;
		this.number=number;
		contacts.add(name + "   " + number);
	}
	

	
	
	public ArrayList<String> getContacts() {
		return contacts;
	}

	public void setContacts(ArrayList<String> contacts) {
		this.contacts = contacts;
	}

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

	public void inthongtin() {
		for(int i=0;i<contacts.size();i++) {
			System.out.println(contacts.get(i));
		}
	}


	public  abstract void  insertContact(String name,String phone);
	
	public abstract void  removeContact(String name);
	
	public abstract void  updateContact(String name,String newphone); 
	
	public abstract void searchContact(String name);
}
