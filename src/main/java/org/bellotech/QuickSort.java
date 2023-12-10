package org.bellotech;

public class QuickSort {

    public static void main(String[] args) {


        int[] arr = {2, 3, 4, 1, 9, 7, 8};
        int size = arr.length;

        quickSort(arr, 0, size - 1);
    }

    private static void quickSort(int[] arr,int low, int high) {

       if (low<high){

           int p = partition(arr,low,high);

           quickSort(arr,low,p-1);
           quickSort(arr,p+1,high);

       }



    }

    private static int partition(int[] arr, int low, int high) {

        int i = low-1;
        int pivot = arr[high];


        for(int j = low; j<arr.length; j++){
            if (arr[j] < pivot){

                i++;

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;

        return i+1;
    }
}