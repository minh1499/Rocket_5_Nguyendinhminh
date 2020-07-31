package assignment4;

import java.util.ArrayList;

public class VietnamesePhone extends Phone {

	@Override
	public void insertContact(String name, String phone) {
		super.Phone(name, phone);
	}

	@Override
	public void removeContact(String name) {
		boolean test = false;
		for(int i = 0; i<super.getContacts().size(); i++) {
			if(super.getContacts().get(i).contains(name)) {
				super.getContacts().remove(i);
				i--;
				test = true;
			}
		}
		if(!test) {
			System.out.println("Khong co contact ten " + name);
		}
	}

	@Override
	public void updateContact(String name, String newphone) {
		boolean test = false;
		for(int i = 0; i<super.getContacts().size(); i++) {
			if(super.getContacts().get(i).contains(name)) {
				super.getContacts().set(i, name +"   " + newphone);
				test = true;
			}
		}
		if(!test) {
			System.out.println("Khong co contact ten " + name);
		}
	}

	@Override
	public void searchContact(String name) {
		boolean test = false;
		for(int i = 0; i<super.getContacts().size(); i++) {
			if(super.getContacts().get(i).contains(name)) {
				System.out.println(super.getContacts().get(i));
				test = true;
			}
		}
		if(!test) {
			System.out.println("Khong co contact ten " + name);
		}
	}
	
	public void inthongtin() {
		super.inthongtin();
	}



}
