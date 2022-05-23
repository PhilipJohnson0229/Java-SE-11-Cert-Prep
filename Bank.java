package com.philipJohnson;

import java.util.ArrayList;

public class Bank {

    private String name;

    ArrayList<Branch> branchArrayList = new ArrayList<Branch>();

    public Bank(String name)
    {
        this.name = name;
    }


    public boolean addBranch(String branchName)
    {
        if(findBranch(branchName) == null)
        {
            this.branchArrayList.add(new Branch(branchName));
            return true;
        }

        return false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Branch findBranch(String branchName)
    {
        for(int i = 0; i < branchArrayList.size(); i++)
        {
            Branch foundBranch = this.branchArrayList.get(i);

            if(foundBranch.getBranchName().equals(branchName))
            {
                return foundBranch;
            }
        }
        return null;
    }

    public boolean addCustomer(String branchName, String customerName, double initialAmount)
    {
        Branch branch = findBranch(branchName);

        if(branch != null)
        {
            return branch.newCustomer(customerName, initialAmount);
        }
        return false;
    }

    public boolean addCustomerTransaction(String branchName, String customerName, double amount)
    {
        Branch branch = findBranch(branchName);

        if(branch != null)
        {
            return branch.addNewCustomerTransaction(customerName, amount);
        }
        return false;
    }

    public boolean listCustomers(String branchName, boolean showTransactions)
    {
        Branch branch = findBranch(branchName);

        if(branch != null)
        {
            System.out.println("Customers for branch " + branch.getBranchName());

            ArrayList<Customer> customers =branch.getCustomerArrayList();
            for(int i = 0; i < customers.size(); i++)
            {
                Customer branchCustomer = customers.get(i);
                System.out.println("Customer" + branchCustomer.getName() + "[" + (i + 1) + "]");
                if(showTransactions)
                {
                    System.out.println("Transactions");
                    ArrayList<Double> transactions = branchCustomer.getTransactionArrayList();
                    for(int j = 0; j < transactions.size(); j++)
                    {
                        System.out.println( "[" + j + "] Amount: " + transactions.get(j));
                    }
                }else
                {
                    return false;
                }
            }
        }
        System.out.println("Unable to find branch");
        return false;
    }
}
