package org.bellotech;

public class LinearSearch {

    public static void main(String[] args) {

        int [] array = new int[1000];
        int value = 1000;

        int index = binarySearch(array, 1000, 0, array.length-1);
       // int index = binarySearch(array, 1);

        if(index != -1){
            System.out.println("Element found at Index  :" + index);
        }else {
            System.out.println("Index Not found");
        }

    }

    private static int binarySearch(int[] array, int value, int left, int right) {

        if (left <= right){

            int mid = (left + right )/2;
            if (array[mid] == value ){
                return mid;
            } else if (array[mid] <  value) {

                return binarySearch( array, value,mid+1, right );

            }else
                return binarySearch(array, value, left,mid-1);

        }

        return -1;
    }

/*    private static int linearSearch(int[] array, int value) {

        for (int i = 0; i <array.length; i++) {

            if (array[i] == value) {
                return i;
            }


        }
        return -1;
    }
    private static int binarySearch(int[] array, int value) {
        
        int left = 0;
        int right = array.length-1;
        
        while(left <= right){
            
            int mid = (left + right)/2;
            if (array[mid]==value){
                
                return mid;
            } else if (array[mid] < value) {
                left = mid + 1;


                
            }else
                right = mid - 1;


        }
    
        
        return -1;
    }*/
    
    }
