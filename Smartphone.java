package com.philipJohnson;

import java.util.ArrayList;

public class Smartphone {
    //create a mobile phone with the following capabilities
    //able to store, modify, query, and remove contact names
    //create a separate class for contacts
    //create a master class that holds the array lists of contacts
    //add an option menu
    //quit, print list of contacts, add contacts, modify contacts, remove contacts
    //when adding or updating be sure to check if the contact already exists
    //be sure not to expose the inner workings of the array list
    //mobile phone should do everything with contact objects only
    private ArrayList<Contact> contacts = new ArrayList<Contact>();

    private ArrayList<String> contactInfo = new ArrayList<String>();

    public void addContact(String name, String number)
    {
        Contact newContact  = new Contact(name, number);

        contacts.add(newContact);

        contactInfo.add(newContact.contactInfo());
    }

    private void verifyContact()
    {

    }

    public ArrayList<String> getContacts() {
        return contactInfo;
    }

    public void printContactList()
    {
        System.out.println("You have " + contacts.size() + " contacts in your address book.");
        for(int i = 0; i < contacts.size(); i++)
        {
            System.out.println((i + 1) + ". " + contacts.get(i).contactInfo());
        }
    }

    public void modifyContact(String newName, String newNumber)
    {
        int position = findItem(newName);

        if(position >= 0)
        {
            modifyContact(position, newName, newNumber);
        }
    }

    private void modifyContact(int position, String newContact, String newNumber)
    {
        contactInfo.set(position, newContact);

        contacts.get(position).modifyInfo(newContact,newNumber);
        System.out.println("contact at position " + (position + 1) + " has been modified");
    }

    public void removeContact(String number)
    {
        int position = findItem(number);

        if(position >= 0)
        {
            removeContact(position);
        }
    }

    public void removeContact(int position)
    {
        //Contact theItem = contacts.get(position);
        //if we remove an item from the list then the ascending item will descend into the vacant spot
        //i.e. the item at position 2 will now be at position 1 which is the second index
        contacts.remove(position);
        contactInfo.remove(position);
        System.out.println("The contact at position " + (position + 1) + " has been removed");
    }

    private int findItem(String searchItem)
    {
        return contactInfo.indexOf(contacts.indexOf(searchItem));
    }

    public boolean onFile(String searchItem)
    {
        int position = findItem(searchItem);
        if(position >= 0)
        {
            return true;
        }

        return false;
    }
}
