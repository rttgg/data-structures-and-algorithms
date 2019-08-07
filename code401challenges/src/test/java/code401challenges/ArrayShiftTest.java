package code401challenges;


import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;


public class ArrayShiftTest {


    @Test
    public void testInsertShiftArray_ArrayWithOddLength() {
        int[] newArray = new int[]{ 1,2,3,4,5};
        int[] outPut = new int[]{ 1,2,9,3,4,5};
        assertArrayEquals(outPut, ArrayShift.insertShiftArray(newArray, 9));
    }
    @Test
    public void testInsertShiftArray_ArrayWithEvenLength() {
        int[] newArray = new int[]{ 1,2,3,4};
        int[] outPut = new int[]{ 1,2,9,3,4};
        assertArrayEquals(outPut, ArrayShift.insertShiftArray(newArray, 9));
    }

    @Test
    public void testInsertShiftArray_ArrayWithZeroLength() {
        int[] newArray = new int[]{};
        int[] outPut = new int[]{9};
        assertArrayEquals(outPut, ArrayShift.insertShiftArray(newArray, 9));
    }

}
