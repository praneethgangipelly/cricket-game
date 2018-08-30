package com.company;

import java.util.ArrayList;

public class Contacts {


   public ArrayList<String> contacts = new ArrayList<>();

    public Contacts(ArrayList<String> contacts) {
        this.contacts = contacts;
    }

    public ArrayList<String> getContacts() {
        return contacts;
    }

    public void  createContact(String Name){

        contacts.add(Name);
    }
    public void modifyContact(String contact){
        int position = FindContactPosition(contact);
        modifyContact(position,contact);
    }
    private void modifyContact(int position, String contact){
        contacts.set(position,contact);
    }
    private int FindContactPosition(String contact){
       int position =contacts.indexOf(contact);
        return position;
    }
    public void RemoveContact(String contact){
       int position = FindContactPosition(contact);
       contacts.remove(position);
    }

}
