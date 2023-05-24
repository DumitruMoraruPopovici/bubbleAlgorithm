package org.example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BubbleAlgorithmTest {

    @Test
    void givenAListReturnASortedList() {
        List<SalesRepresentative> salesRepresentativeList = new ArrayList<>();
        SalesRepresentative salesRepresentative1 = new SalesRepresentative(1, 10, 500);
        SalesRepresentative salesRepresentative2 = new SalesRepresentative(2, 11, 50);
        SalesRepresentative salesRepresentative3 = new SalesRepresentative(3, 18, 100);
        SalesRepresentative salesRepresentative4 = new SalesRepresentative(4, 8, 300);
        salesRepresentativeList.add(salesRepresentative1);
        salesRepresentativeList.add(salesRepresentative2);
        salesRepresentativeList.add(salesRepresentative3);
        salesRepresentativeList.add(salesRepresentative4);
        BubbleAlgorithm bubbleAlgorithm = new BubbleAlgorithm();

        bubbleAlgorithm.bubbleSortDescending(salesRepresentativeList);

        assertEquals(550, salesRepresentativeList.get(3).getRevenueGenerated());
    }
}