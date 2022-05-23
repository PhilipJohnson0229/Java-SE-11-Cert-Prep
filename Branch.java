package com.philipJohnson;

import java.util.ArrayList;

public class Branch {
    private String branchName;
    private ArrayList<Customer> customerArrayList;

    public Branch(String name) {
        this.branchName = name;
        this.customerArrayList = new ArrayList<Customer>();
    }

    public ArrayList<Customer> getCustomerArrayList() {
        return customerArrayList;
    }

    public String getBranchName() { return branchName; }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public boolean newCustomer(String newCostumer, Double initialAmount)
    {
        if(findCustomer(newCostumer) == null)
        {
            this.customerArrayList.add(new Customer(newCostumer, initialAmount));
            return true;
        }

        return false;
    }

    public boolean addNewCustomerTransaction(String customerName, double amount)
    {
        Customer existingCustomer = findCustomer(customerName);

        if(existingCustomer != null)
        {
            existingCustomer.addNewTransaction(amount);
            return true;
        }
        return false;
    }

    public int findCustomer(Customer customer)
    {
        return customerArrayList.indexOf(customer);
    }

    private Customer findCustomer(String customerName)
    {
        for(int i = 0; i < customerArrayList.size(); i++)
        {
            Customer foundCustomer = this.customerArrayList.get(i);

           if(foundCustomer.getName().equals(customerName))
           {
               return foundCustomer;
           }
        }
        return null;
    }

    public String queryCustomer(Customer customer)
    {
        if(findCustomer(customer) >= 0)
        {
            return customer.getName();
        }

        return null;
    }
}
