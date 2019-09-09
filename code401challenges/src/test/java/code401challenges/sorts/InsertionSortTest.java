package code401challenges.sorts;

import org.junit.Test;

import static org.junit.Assert.*;

public class InsertionSortTest {
//happy path
    //expected failure
    // edge case
    @Test
    public void sort() {
        int arr[] = {20, 9, 33, 2, 12};

        InsertionSort insertsort = new InsertionSort();
        insertsort.sort(arr);
        assertArrayEquals(new int[]{2,9,12, 20, 33}, arr);
        System.out.println(insertsort);
    }

    @Test
    public void wrongsort() {
        int arr[] = {20, 9, 33, 2, 12};

        InsertionSort insertsort = new InsertionSort();
        insertsort.sort(arr);
        assertArrayEquals(new int[]{2,9,12, 20, 33}, arr);
        System.out.println(insertsort);
    }
    // edge case for empty length
    @Test
    public void empty() {
        int arr[] = {};

        InsertionSort insertsort = new InsertionSort();
        insertsort.sort(arr);
        assertArrayEquals(new int[]{}, arr);
        System.out.println(insertsort);
    }
}
//    @Test
//    public void printArray(int[] arr) {
//    }
//}