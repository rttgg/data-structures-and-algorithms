package code401challenges.QuickSort;

import org.junit.Test;

import static org.junit.Assert.*;

public class QuickSortTest {

    @Test
    public void partition() {
        int arr[] = {10, 7, 8, 9, 1, 5};
        QuickSort ob = new QuickSort();
        ob.sort(arr, 0, arr.length-1);
        assertArrayEquals(new int[] {1,5,7,8,9,10}, arr);
    }

    @Test
    public void partitionwithzero() {
        int arr[] = {10, 7, 8, 9, 1, 5,0};
        QuickSort ob = new QuickSort();
        ob.sort(arr, 0, arr.length-1);
        assertArrayEquals(new int[] {0,1,5,7,8,9,10}, arr);
    }
    @Test
    public void partitionempty() {
        int arr[] = { };
        QuickSort ob = new QuickSort();
        ob.sort(arr, 0, arr.length-1);
        assertArrayEquals(new int[] { }, arr);
    }

    @Test
    public void partitiondouble() {
        int arr[] = {10, 7, 7, 8, 9, 1, 1, 5,0};
        QuickSort ob = new QuickSort();
        ob.sort(arr, 0, arr.length-1);
        assertArrayEquals(new int[] {0,1,1,5,7,7,8,9,10}, arr);
    }


}