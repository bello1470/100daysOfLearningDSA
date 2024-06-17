package org.bellotech;

import java.util.Arrays;

public class MaxNumber {

    public static void main(String[] args) {

            int [] arr = {1,2,3,4,5,6,7};

            maxVal(arr);
        System.out.println(maxVal(arr));

    }

    public static int maxVal( int [] arr){

        int maxVal = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if ( arr[i] > maxVal) {
                maxVal = arr[i];

            }

        }



        return maxVal;
    }

    public static int maxRange(int [] arr, int start, int end){



        return 0;
    }
}
