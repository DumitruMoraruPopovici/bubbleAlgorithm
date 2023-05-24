package org.example;

import java.util.Objects;

public class SalesRepresentative {
    public int id;
    public int numberOfSales;
    public int quotaPerSale;
    public Integer revenueGenerated;

    public SalesRepresentative(int id, int numberOfSales, int quotaPerSale) {
        this.id = id;
        this.numberOfSales = numberOfSales;
        this.quotaPerSale = quotaPerSale;
        this.revenueGenerated = numberOfSales * quotaPerSale;
    }




    public int getRevenueGenerated() {
        return revenueGenerated;
    }


    @Override
    public String toString() {
        return "Sales guy " + id + " sales with quota of " +
                quotaPerSale + "$. He has achieved " + revenueGenerated + "$ worth of sales.";
    }

}
