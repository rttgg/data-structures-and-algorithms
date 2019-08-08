package code401challenges;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BinarySearchTest {
    @Test public void testBinarySearch() {
        int[] inputArr = {1,2,3,4,5};
        int target = 3;
        assertEquals("Index is: ", 2, BinarySearch.binarySearch(inputArr, target));
    }
    @Test public void testBinarySearchNotSorted() {
        int[] inputArr = {-1,2,3,4,5};
        int target = 3;
        assertEquals("Index is: ", 2, BinarySearch.binarySearch(inputArr, target));
    }
}