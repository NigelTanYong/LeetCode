class Solution {
    public double findMaxAverage(int[] nums, int k) {
        // Calculate the sum of the first k elements
        int windowSum = 0;
        for (int i = 0; i < k; i++) {
            windowSum += nums[i];
        }
        
        // Initialize maxSum to the sum of the first window
        int maxSum = windowSum;
        
        // Slide the window and update maxSum
        for (int i = k; i < nums.length; i++) {
            windowSum += nums[i] - nums[i - k]; // Add the next element and remove the first element
            maxSum = Math.max(maxSum, windowSum); // Update maxSum if needed
        }
        
        return (double) maxSum / k; // Return the maximum average
    }
}