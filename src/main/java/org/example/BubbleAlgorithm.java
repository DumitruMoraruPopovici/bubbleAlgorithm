package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class BubbleAlgorithm  {
    List<SalesRepresentative> salesRepresentatives = new ArrayList<>();
    public void addToList(SalesRepresentative salesRepresentative) throws ValidationException {
        try {
            if (salesRepresentative.id == 0) {
                throw new ValidationException("Id cannot be 0");
            }

        if (salesRepresentative.numberOfSales == 0) {
            throw new ValidationException("Do youre job mate");
        }
        if (salesRepresentative.quotaPerSale == 0) {
            throw new ValidationException("Increase value of sales for " + salesRepresentative.id);

        }
        if (salesRepresentative == null) {
            throw new ValidationException("Sales Representative cannot be null");
        }
    } catch (ValidationException e) {
            System.out.println(e.getMessage());
        }


         salesRepresentatives.add(salesRepresentative);


    }
    public void bubbleSortDescending(List<SalesRepresentative> salesRepresentativeList) {
        int n = salesRepresentativeList.size();

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (salesRepresentativeList.get(j).getRevenueGenerated() <
                        salesRepresentativeList.get(j + 1).getRevenueGenerated()) {
                    SalesRepresentative helper = salesRepresentativeList.get(j);
                    salesRepresentativeList.set(j, salesRepresentativeList.get(j + 1));
                    salesRepresentativeList.set(j + 1, helper);
                }
            }
        }
    }
}