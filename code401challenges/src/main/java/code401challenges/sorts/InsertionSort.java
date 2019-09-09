package code401challenges.sorts;

public class InsertionSort{
    void sort(int[] arr){

        for (int i = 1; i < arr.length; i++){
            int temp = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > temp){
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = temp;
        }
    }
    static void printArray(int arr[]){
        int n = arr. length;
        for (int i = 0; i < n; i++)
            System.out.println(arr[i] + " ");
            System.out.println();
    }

    public static void main (String args[]){
        int arr[] = { 20, 9, 33, 2, 12};
        InsertionSort insertsort = new InsertionSort();
        insertsort.sort(arr);
        printArray(arr);
    }

    public void InsertionSort(int[] arr) {
    }

//    public void insertionSort(int[] arr) {
//    }
}
