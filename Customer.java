package com.philipJohnson;

import java.util.ArrayList;

public class Customer {

    private String name;
    ArrayList<Double> transactionArrayList = new ArrayList<Double>();

    public Customer(String name, Double initialTransaction) {
        this.name = name;
        this.transactionArrayList = new ArrayList<Double>();
        addNewTransaction(initialTransaction);
    }

    public ArrayList<Double> getTransactionArrayList() {
        return transactionArrayList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public void addNewTransaction(double newTransaction)
    {
        transactionArrayList.add(newTransaction);
    }
}
