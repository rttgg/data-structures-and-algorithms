package code401challenges;

import java.util.Arrays;

public class BinarySearch{
    public static int binarySearch(int[] theArr, int target){
        int middleInx = theArr.length/2;
        while(middleInx < theArr.length && middleInx > 0){
            if(theArr[middleInx] == target){
                return middleInx;
            } else if(theArr[middleInx] < target){
                middleInx = (middleInx + theArr.length)/2;
            } else if(theArr[middleInx] > target){
                middleInx = middleInx/2;
            } else {
                return -1;
            }
        }
        return middleInx;
    }
}


