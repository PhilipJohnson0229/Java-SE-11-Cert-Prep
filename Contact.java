package com.philipJohnson;

public class Contact
{
    private String name;
    private String number;

    public Contact(String name, String number)
    {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }

    public String contactInfo()
    {
        return name + " : " + number;
    }

    public void modifyInfo(String newName, String newNumber)
    {
        this.name = newName;
        this.number = newNumber;
    }

    public static Contact createNewContact(String name, String number)
    {
        return new Contact(name, number);
    }
}
