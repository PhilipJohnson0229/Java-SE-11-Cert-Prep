package com.philipJohnson;

import java.util.ArrayList;
import java.util.Scanner;

public class GroceryListCreator {
    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();

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
                    groceryList.printGroceryList();
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
        System.out.println("Please enter an item: ");
        groceryList.addGroceryItem(scanner.nextLine());
    }

    public static void modifyItem()
    {
        System.out.println("Enter the item number: ");
        String itemNumber = scanner.nextLine();


        System.out.println("Please enter the new item: ");
        String newItem = scanner.nextLine();

        groceryList.modifyGroceryListItem(itemNumber, newItem);
        scanner.nextLine();
    }

    public static void removeItem()
    {
        System.out.println("Enter the item name: ");
        String itemNumber = scanner.nextLine();

        groceryList.removeGroceryItem(itemNumber);
        scanner.nextLine();
    }

    public static void searchForItem()
    {

        System.out.println("Please enter the search item: ");
        String searchItem = scanner.nextLine();

       if(groceryList.onFile(searchItem))
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
        newArray.addAll(groceryList.getGroceryList());

        ArrayList<String> nextArrayList = new ArrayList<String>(groceryList.getGroceryList());

        String[] myArray = new String[groceryList.getGroceryList().size()];
        myArray = groceryList.getGroceryList().toArray(myArray);
    }
}
