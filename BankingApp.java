package com.philipJohnson;

public class BankingApp {

    public static void main(String[] args)
    {
        Bank bank = new Bank("Best");

        bank.addBranch("North City Branch");

        bank.addCustomer("North City Branch", "Phil", 151.0);
        bank.addCustomer("North City Branch", "Adele", 200000000.00);
        bank.addCustomer("North City Branch", "Austin Powers", 200.0);
        bank.addCustomer("North City Branch", "Gambit", 10.0);

        bank.addBranch("South City Branch");
        bank.addCustomer("North City Branch", "Saitama", 5000000.0);
        bank.addCustomerTransaction("North City Branch","Tim",44.22);
        bank.addCustomerTransaction("North City Branch","Tim",49.22);
        bank.addCustomerTransaction("North City Branch","Tim",75.22);
        bank.addCustomerTransaction("North City Branch","Tim",20.22);

        bank.listCustomers("North City Branch", true);
    }
}
