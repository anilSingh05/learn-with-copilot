package org.example.withjunit;

import static org.junit.jupiter.api.Assertions.*;

public class SpringBootWithJunitTest {

    @org.junit.jupiter.api.Test
    void isSubList() {
        // Test case 1
        int[] list1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] subList1 = {3, 4, 5};
        assertTrue(SpringBootWithJunit.isSubList(list1, subList1));

    }

    @org.junit.jupiter.api.Test
    void isConcatenation() {
    }
}