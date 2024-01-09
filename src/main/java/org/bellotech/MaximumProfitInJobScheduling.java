package org.bellotech;
import java.util.Arrays;
import java.util.TreeMap;

public class MaximumProfitInJobScheduling {


    class Solution {
        public int jobScheduling(int[] startTime, int[] endTime, int[] profit) {
            int n = startTime.length;
            Job[] jobs = new Job[n];

            for (int i = 0; i < n; i++) {
                jobs[i] = new Job(startTime[i], endTime[i], profit[i]);
            }

            // Sort jobs based on their end times
            Arrays.sort(jobs, (a, b) -> a.end - b.end);

            // dp[i] represents the maximum profit till time jobs[i].end
            int[] dp = new int[n];
            dp[0] = jobs[0].profit;

            for (int i = 1; i < n; i++) {
                int currentProfit = jobs[i].profit;
                int prevNonOverlappingJobIndex = binarySearch(jobs, i);

                // Include the current job or skip it
                dp[i] = Math.max(currentProfit + (prevNonOverlappingJobIndex >= 0 ? dp[prevNonOverlappingJobIndex] : 0),
                        dp[i - 1]);
            }

            return dp[n - 1];
        }

        // Binary search to find the index of the latest job that doesn't overlap with the current job
        private int binarySearch(Job[] jobs, int index) {
            int low = 0, high = index - 1;

            while (low <= high) {
                int mid = (low + high) / 2;
                if (jobs[mid].end <= jobs[index].start) {
                    if (jobs[mid + 1].end <= jobs[index].start) {
                        low = mid + 1;
                    } else {
                        return mid;
                    }
                } else {
                    high = mid - 1;
                }
            }

            return -1; // No non-overlapping job found
        }

        // Job class to store start time, end time, and profit
        class Job {
            int start;
            int end;
            int profit;

            public Job(int start, int end, int profit) {
                this.start = start;
                this.end = end;
                this.profit = profit;
            }
        }
    }
}
