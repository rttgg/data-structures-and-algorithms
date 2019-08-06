import java.util.Arrays;


public class ArrayReverse {
  public static void main(String[] args) {
    int[] toBeReversed = new int[]{1,2,3,4,5};
    System.out.println(Arrays.toString(reverseArray(toBeReversed)));
  }
  public static int[] reverseArray(int[] arr) {
   int[] myArrayTemp = new int[arr.length];

   int number = 0;
   for (int i = arr.length - 1; i >= 0; i--){
     myArrayTemp[number] = arr[i];
     number = number + 1;
   }
    
    return myArrayTemp;
  }
}
