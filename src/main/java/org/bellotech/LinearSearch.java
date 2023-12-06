package org.bellotech;

public class LinearSearch {

    public static void main(String[] args) {

        int [] array = {1,2,4,4,5,6,7};

        int index = linearSearch(array, 7);

        if(index != -1){
            System.out.println("Element found at Index  :" + index);
        }else {
            System.out.println("Index Not found");
        }

    }

    private static int linearSearch(int[] array, int value) {

        for (int i = 0; i <array.length; i++) {

            if (array[i] == value) {
                return i;
            }


        }
        return -1;
    }
    }
