package org.bellotech;

public class ArithmeticSlices2Subsequence {
    public int numberOfArithmeticSlices(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n]; // dp[i] stores the number of arithmetic slices ending at i
        int totalSlices = 0;

        for (int i = 2; i < n; i++) {
            if (nums[i] - nums[i - 1] == nums[i - 1] - nums[i - 2]) {
                // Extend existing arithmetic slices
                dp[i] = dp[i - 1] + 1;

                // Add newly formed arithmetic slices of length 3
                totalSlices += dp[i];
            }
        }

        return totalSlices;
    }
}


