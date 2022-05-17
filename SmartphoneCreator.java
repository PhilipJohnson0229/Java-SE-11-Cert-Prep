package com.philipJohnson;

import java.util.Scanner;
import java.util.ArrayList;

public class SmartphoneCreator {
    private static Scanner scanner = new Scanner(System.in);

    private static Smartphone smartphone = new Smartphone();

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
                    printInstructions();
                    break;
                case 1:
                    smartphone.printContactList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6:
                    processArrayList();
                    break;
                case 7:
                    quit = true;
                    break;

            }
        }
    }

    public static void printInstructions()
    {
        System.out.println("\n Press");
        System.out.println("\t 0 - to see options.");
        System.out.println("\t 1 - to print the list of grocery items.");
        System.out.println("\t 2 - to add an item to the list.");
        System.out.println("\t 3 - to modify an item in the list.");
        System.out.println("\t 4 - to remove an item from the list.");
        System.out.println("\t 5 - to search for an item on the list.");
        System.out.println("\t 6 - to quit the application.");
    }

    public static void addItem()
    {
        System.out.println("Please enter a number: ");
        String number = scanner.nextLine();

        System.out.println("Please enter a name: ");
        String name = scanner.nextLine();

        smartphone.addContact(name, number);
        scanner.nextLine();
    }

    public static void modifyItem()
    {
        System.out.println("Enter the phone number: ");
        String itemNumber = scanner.nextLine();


        System.out.println("Please enter the new name: ");
        String newItem = scanner.nextLine();

        smartphone.modifyContact(itemNumber, newItem);
        scanner.nextLine();
    }

    public static void removeItem()
    {
        System.out.println("Enter the item name: ");
        String itemNumber = scanner.nextLine();

        smartphone.removeContact(itemNumber);
        scanner.nextLine();
    }

    public static void searchForItem()
    {

        System.out.println("Please enter the search item: ");
        String searchItem = scanner.nextLine();

        if(smartphone.onFile(searchItem))
        {
            System.out.println("Found " + searchItem + " in the grocery list.");
        }
        else
        {
            System.out.println(searchItem + " is not in the grocery list.0");
        }
    }

    public static void processArrayList()
    {
        ArrayList<String> newArray = new ArrayList<String>();
        newArray.addAll(smartphone.getContacts());

        ArrayList<String> nextArrayList = new ArrayList<String>(smartphone.getContacts());

        String[] myArray = new String[smartphone.getContacts().size()];
        myArray = smartphone.getContacts().toArray(myArray);
    }
}
