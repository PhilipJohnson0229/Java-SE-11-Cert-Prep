package com.philipJohnson;

public interface Payroll {

    public abstract double calculateNetWages();

    public abstract void setTaxBracket(double bracket );

    public abstract Payroll savePayroll(Payroll payroll);

}
