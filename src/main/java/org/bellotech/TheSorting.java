package org.bellotech;

public class TheSorting {

    public static void main(String[] args) {

        int[] nums = {9, 1, 4, 5, 7, 6, 2, 3, 8};
        int size = nums.length;
        //  int temp = 0;
        // int minIndex;

        System.out.println("Before Sorting");
        for (int num : nums) {
            System.out.print(num + " ");
        }



         for(int i = 1; i<size; i++){

             int key = nums[i];
             int j = i-1;

             while (j>=0 && nums[j] > key  ) {

                 nums[j+1] = nums[j];
                 j--;
             }
             nums[j+1] = key;
         }

       /*

       // SELECTION SORTING LOGIC
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
*/
        System.out.println();
        for (int num : nums) {
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



    }

