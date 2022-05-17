package com.philipJohnson;

import java.util.ArrayList;

public class GroceryList {
    private ArrayList<String> groceryList = new ArrayList<String>();

    public ArrayList<String> getGroceryList()
    {
        return groceryList;
    }

    public void addGroceryItem(String item)
    {
        //these type of methods are unique to ArrayLists
        groceryList.add(item);
    }

    public void printGroceryList()
    {
        System.out.println("You have " + groceryList.size() + " Items in your grocery list.");
        for(int i = 0; i < groceryList.size(); i++)
        {
            System.out.println((i + 1) + ". " + groceryList.get(i));
        }
    }

    public void modifyGroceryListItem(String currentItem, String newItem)
    {
        int position = findItem(newItem);

        if(position >= 0)
        {
            modifyGroceryListItem(position, newItem);
        }
    }

    private void modifyGroceryListItem(int position, String newItem)
    {
        groceryList.set(position, newItem);
        System.out.println("Grocery item at position " + (position + 1) + " has been modified");
    }

    public void removeGroceryItem(String item)
    {
        int position = findItem(item);

        if(position >= 0)
        {
            removeGroceryItem(position);
        }
    }

    public void removeGroceryItem(int position)
    {
        //String theItem = groceryList.get(position);
        //if we remove an item from the list then the ascending item will descend into the vacant spot
        //i.e. the item at position 2 will now be at position 1 which is the second index
        groceryList.remove(position);

        System.out.println("The Grocery item as position " + position + " has been removed");
    }

    private int findItem(String searchItem)
    {
        return groceryList.indexOf(searchItem);
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
