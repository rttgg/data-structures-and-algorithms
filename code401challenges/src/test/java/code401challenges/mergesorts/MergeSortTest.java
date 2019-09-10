package code401challenges.mergesorts;

import org.junit.Test;

import static org.junit.Assert.*;

public class MergeSortTest {

    @Test
    public void testSort() {
        int arr[] = { 12, 11, 13, 5, 6, 7 };

            MergeSort newSort = new MergeSort();
            newSort.sort(arr, 0, arr.length-1);
            assertArrayEquals(new int[]{5, 6, 7, 11, 12, 13}, arr);

        }


    @Test
    public void merge() {
    }

    @Test
    public void printArray() {
    }

    @Test
    public void main() {
    }
}