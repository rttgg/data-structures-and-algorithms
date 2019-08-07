import java.util.Arrays;

public class ArrayShift{
    public static void main(String[] args) {
        int[] toBeShift = new int[]{1,2,3,4,5};
        System.out.println(Arrays.toString(insertShiftArray(toBeShift, 5)));
    }
    public static int[] insertShiftArray(int[] arr, int add) {
        int[] myNewArray = new int[arr.length + 1];
        double middleIndex = Math.floor(arr.length/2);

        for (int i = 0; i < middleIndex; i++){
            myNewArray[i] = arr[i];
        }
        myNewArray[(int)middleIndex] = add;
        for (int j = (int)middleIndex +1; j <= arr.length; j++){
            myNewArray[j] = arr[j-1];
        }


        return myNewArray;
    }
}
