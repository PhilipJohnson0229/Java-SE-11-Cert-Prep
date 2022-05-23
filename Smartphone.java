package com.philipJohnson;

import java.util.ArrayList;

public class Smartphone {
    private String myNumber;
    private ArrayList<Contact> myContacts;

    public Smartphone(String myNumber)
    {
        this.myNumber = myNumber;
        myContacts = new ArrayList<Contact>();
    }

    public boolean addContact(Contact contact)
    {
        if(findContact(contact.getName()) >= 0)
        {
            System.out.println("Contact already exists.");
            return false;
        }
        myContacts.add(contact);
        return true;
    }


    public void printContactList()
    {
        System.out.println("You have " + myContacts.size() + " contacts in your address book.");
        for(int i = 0; i < myContacts.size(); i++)
        {
            System.out.println((i + 1) + ". " + myContacts.get(i).getName()
                    + " -> " + myContacts.get(i).getNumber());
        }
    }

    public boolean modifyContact(Contact oldContact, Contact newContact)
    {
        int foundPosition = findContact(oldContact);
        if(foundPosition < 0)
        {
            System.out.println(oldContact.getName() + " was not found.");
            return false;
        }
        else if (findContact(newContact.getName()) != -1)
        {
            System.out.println("Contact with name " + newContact.getName() + " already exists");
        }

        this.myContacts.set(foundPosition, newContact);
        System.out.println(oldContact.getName() + " was replaced with " + newContact.getName());
        return true;
    }

    public boolean removeContact(Contact contact)
    {
        int foundPosition = findContact(contact);
        if(foundPosition < 0)
        {
            System.out.println(contact.getName() + " was not found.");
            return false;
        }
        this.myContacts.remove(foundPosition);
        System.out.println(contact.getName() + " was deleted.");
        return true;
    }



    private int findContact(Contact contact)
    {
        return myContacts.indexOf(contact);
    }

    private int findContact(String contactName)
    {
        for(int i = 0; i < myContacts.size(); i++)
        {
            Contact myContact = this.myContacts.get(i);
            if(myContact.getName().equals(contactName))
            {
                return i;
            }

        }
        return -1;
    }

    public String queryContact(Contact contact)
    {
        if(findContact(contact) >= 0)
        {
            return contact.getName();
        }

        return null;
    }

    public Contact queryContact(String name)
    {
        int position = findContact(name);

        if(position >= 0)
        {
            return this.myContacts.get(position);
        }
        return null;
    }
}
