package org.bellotech;
import java.util.HashMap;
import java.util.Map;

public class ArithSlice2Subs2 {


        public int numberOfArithmeticSlices(int[] nums) {
            int n = nums.length;
            int result = 0;

            // dp[i] represents the number of arithmetic subsequences ending at index i
            Map<Integer, Integer>[] dp = new HashMap[n];

            for (int i = 0; i < n; i++) {
                dp[i] = new HashMap<>();
                for (int j = 0; j < i; j++) {
                    long diff = (long) nums[i] - nums[j];

                    // If the difference exceeds the range of int, skip this pair
                    if (diff <= Integer.MIN_VALUE || diff > Integer.MAX_VALUE)
                        continue;

                    int d = (int) diff;

                    // Get the count of subsequences ending at index j with common difference d
                    int countJ = dp[j].getOrDefault(d, 0);

                    // Update the result and add the count to the subsequences ending at index i
                    result += countJ;
                    dp[i].put(d, dp[i].getOrDefault(d, 0) + countJ + 1);
                }
            }

            return result;
        }
    }


