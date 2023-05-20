package org.example;

import java.util.ArrayList;
import java.util.List;

/**
 * DESCRIPTION
 * implement a bubble sort algorithm to sort an array of SalesRepresentative objects in descending order
 * //BubbleSortAlgorithm, sortAnArrayDescending, SalesRepresentative
 * the sorting should be done based on the amount of revenue generated via sales
 * // revenueGenerated,
 * each representative has a number of sales, and a quota / sale
 * //numberOfSales, quotaPerSale
 * after the sorting, the first object should be the representative with the most revenue generated
 * the last object in the array should be the representative with the least revenue generated
 * <p>
 * e.g.
 * sales guy 1 has 10 sales with a quota of 500$. He has achieved 5000$ worth of sales.
 * sales guy 2 has 7 sales with a quota of 800$. He has achieved 5600$ worth of sales.
 * <p>
 * Sorting code example
 * <p>
 * SalesRepresentative [ ] representatives = ...
 * SalesRepresentative [ ] sortedRepresentatives = sort(representatives);
 * <p>
 * // you need to implement the sort(SalesRepresentative [ ] representatives) method.
 * This can not be a static method.
 */
public class App {
    public static void main(String[] args) throws ValidationException {

        BubbleAlgorithm bubbleAlgorithm = new BubbleAlgorithm();

        SalesRepresentative salesRepresentative1 = new SalesRepresentative(1, 10, 0);
        SalesRepresentative salesRepresentative2 = new SalesRepresentative(2, 11, 50);
        SalesRepresentative salesRepresentative3 = new SalesRepresentative(3, 18, 230);
        SalesRepresentative salesRepresentative4 = new SalesRepresentative(4, 8, 34);

        bubbleAlgorithm.addToList(salesRepresentative1);
        bubbleAlgorithm.addToList(salesRepresentative2);
        bubbleAlgorithm.addToList(salesRepresentative3);
       bubbleAlgorithm.addToList(salesRepresentative4);

        bubbleAlgorithm.bubbleSortDescending(bubbleAlgorithm.salesRepresentatives);

        System.out.println("List after sorting descending: ");

        bubbleAlgorithm.salesRepresentatives.stream()
                .forEach(System.out::println);

    }
}

