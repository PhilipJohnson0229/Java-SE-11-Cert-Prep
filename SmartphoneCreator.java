package com.philipJohnson;

import java.util.Scanner;
import java.util.ArrayList;

public class SmartphoneCreator {
    private static Scanner scanner = new Scanner(System.in);

    private static Smartphone smartphone = new Smartphone("");

    public static void main(String[] args)
    {

        boolean quit = false;
        int choice = 0;

        printInstructions();

        while(!quit)
        {
           System.out.print("Enter your choice: ");

            choice = scanner.nextInt();
            scanner.nextLine();

            switch(choice)
            {
                case 0:
                    System.out.println("Shutting down...");
                    quit = true;
                    break;
                case 1:
                    smartphone.printContactList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    queryContact();
                    break;
                case 6:
                    printInstructions();
                    break;
            }
        }
    }

    public static  void startPhone()
    {
        System.out.println("Starting phone....");
    }

    public static void printInstructions()
    {
        System.out.println("\n Press");
        System.out.println("\t 0 - to quit.");
        System.out.println("\t 1 - to print the list contacts.");
        System.out.println("\t 2 - to add an new contact.");
        System.out.println("\t 3 - to modify an existing contact.");
        System.out.println("\t 4 - to remove an cotnact.");
        System.out.println("\t 5 - to search for a contact.");
        System.out.println("\t 6 - to print the instructions.");
    }



    public static void addItem()
    {
        System.out.println("Please enter a number: ");
        String number = scanner.nextLine();

        System.out.println("Please enter a name: ");
        String name = scanner.nextLine();

        Contact newContact = new Contact(name, number);
        if(smartphone.addContact(newContact))
        {
            System.out.println("New contact added: " + name + ", " + number);
        }
        else
        {
            System.out.println("Cannot add. " + name + " already on file");
        }
    }

    public static void updateContact()
    {
        System.out.println("Enter the name of the contact you wish to change: ");
        String name = scanner.nextLine();

        Contact existingContactRecord = smartphone.queryContact(name);

        if(existingContactRecord == null)
        {
            System.out.println("Contact not found.");
            return;
        }

        System.out.println("Enter the new contact name: ");
        String newName = scanner.nextLine();
        System.out.println("Enter the new contact number: ");
        String newNumber = scanner.nextLine();

        Contact newContact = Contact.createNewContact(newName, newNumber);
        if(smartphone.modifyContact(existingContactRecord, newContact))
        {
            System.out.println("Contact has been modified.");
        }
        else
        {
            System.out.println("Unable to modify contact.");
        }
    }

    public static void removeContact()
    {
        System.out.println("Enter the name of the contact you wish to change: ");
        String name = scanner.nextLine();

        Contact existingContactRecord = smartphone.queryContact(name);

        if(existingContactRecord == null)
        {
            System.out.println("Contact not found.");
            return;
        }

        if(smartphone.removeContact(existingContactRecord))
        {
            System.out.println("Contact successfully removed.");
        }else
        {
            System.out.println("Unable to remove contact.");
        }
    }

    public static void queryContact()
    {
        System.out.println("Enter the name of the contact you wish to change: ");
        String name = scanner.nextLine();

        Contact existingContactRecord = smartphone.queryContact(name);

        if(existingContactRecord == null)
        {
            System.out.println("Contact not found.");
            return;
        }

        System.out.println("Name: " + existingContactRecord.getName() +
                ", Phone Number: " + existingContactRecord.getNumber());
    }
}
