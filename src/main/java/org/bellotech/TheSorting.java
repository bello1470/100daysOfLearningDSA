package org.bellotech;

public class TheSorting {

    public static void main(String[] args) {

        int [] nums = {9,3,4,1,6,7,5};
        int size = nums.length;
        int temp = 0;
        int minIndex;

        System.out.println("Before Sorting");
        for (int num: nums ) {
            System.out.print(num + " ");
        }

        for (int i = 0; i<size-1; i++){

            // the loop give us min value
            minIndex = i;
            for (int j = i+1; j<size; j++) {

                if (nums[minIndex] > nums[j]) {

                    nums[minIndex] = j;
                }
            }

                temp = nums[minIndex];
                nums[minIndex] = nums[i];
                nums[i] = temp;

            System.out.println();
            for (int num: nums ) {
                System.out.print(num + " ");
            }

        }



       /*
       // BUBBLE SORTING LOGIC
       for(int i = 0; i<size; i++){

            for(int j = 0; j<size-i-1; j++){

                if (nums[j] > nums[j+1]) {

                    temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }

            }
        }*/

        System.out.println();
        System.out.println("After Sorting");
        for (int num: nums ) {
            System.out.print(num + " ");
            }

    }
}
