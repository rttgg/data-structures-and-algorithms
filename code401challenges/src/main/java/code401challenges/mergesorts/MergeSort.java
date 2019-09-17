package code401challenges.mergesorts;

public class MergeSort {


    public static int[] mergeSort(int[] arr) {
        return arr;
    }

    void merge(int arr[], int left, int right, int middle) {

        int sizeleft = middle - left + 1;
        int sizeright = right - middle;

        //create temp arrays
        int L[] = new int[sizeleft];
        int R[] = new int[sizeright];


        //copy data to temp arrays
        for (int i = 0; i < sizeleft; i++) {
            L[i] = arr[left + i];
        }
        for (int j = 0; j < sizeright; j++) {
            R[j] = arr[middle + 1 + j];
        }

        //initial indexes of first and second subarrays
        int i = 0, j = 0;
        int k = left;
        while (i < sizeleft && j < sizeright) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;

            }
            k++;
        }
        //copy remaining elements of L[] if any
        while (i < sizeleft) {
            arr[k] = L[i];
            i++;
            k++;
        }
        //copy remaining elements of R[] if any
        while (j < sizeright) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    public void sort(int arr[], int left, int right) {
        if (left < right) {
            int middle = (left + right) / 2;

            //sort first and second halves
            sort(arr, left, middle);
            sort(arr, middle + 1, right);

            //merge the sorted halves
            merge(arr, left, middle, right);
        }
    }


    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; i++)
        {
            System.out.println(arr[i] + " ");
            System.out.println();
        }

        }

        //driver method
        public static void main (String args[]){
            int arr[] = {12, 11, 13, 5, 6, 7};
            System.out.println("given array");
            printArray(arr);
            MergeSort newarray = new MergeSort();
            newarray.sort(arr, 0, arr.length - 1);

            System.out.println("\nSorted array");
            printArray(arr);
        }


    public void mergeSort(int[] arr, int i, int i1) {

    }
}


