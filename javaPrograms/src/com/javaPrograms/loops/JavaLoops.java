package com.javaPrograms.loops;

import java.util.ArrayList;
import java.util.List;

public class JavaLoops {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Contact> contactList = getContacts();
		
		Integer sizeOfList = contactList.size();
		String emailToField=null;
		
			for(int i=0;i<sizeOfList;i++){
				Contact contact = contactList.get(i);
				emailToField = emailToField + contact.getEmailAddress()+", ";
			}	
		emailToField = emailToField.substring(0, emailToField.length()-2);
		System.out.println(emailToField);
	}
	
	private static List<Contact> getContacts(){
		List<Contact> contacts = new ArrayList<Contact>();
		contacts.add(new Contact("poovarsan@easymedmobile.com"));
		contacts.add(new Contact("poovarasanmurugan@gmail.com"));
		contacts.add(new Contact("poovarasann1@gmail.com"));
		contacts.add(new Contact("poovarasann2@gmail.com"));
		contacts.add(new Contact("poovarasann3@gmail.com"));
		contacts.add(new Contact("poovarasann4@gmail.com"));
		return contacts;
	}
	
	private static class Contact {
		private String emailAddress;
		
		public String getEmailAddress(){
			return emailAddress;
		}
		public Contact(String email){
			this.emailAddress=email;
		}
	}
}
