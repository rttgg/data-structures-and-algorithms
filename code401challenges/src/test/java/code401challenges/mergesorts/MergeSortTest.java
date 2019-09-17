package code401challenges.mergesorts;

import org.junit.Test;

import static org.junit.Assert.*;

public class MergeSortTest {
    @Test
    public void mergeSort() {
        int[] arr = new int[]{5,6,2,1,9,3,4};
        int[] expected = new int[]{1,2,3,4,5,6,9};
        assertArrayEquals(expected, MergeSort.mergeSort(arr));
    }

    @Test
    public void mergeSort_empty() {
        int[] arr = new int[]{};
        int[] expected = new int[]{};
        assertArrayEquals(expected, MergeSort.mergeSort(arr));
    }


}
