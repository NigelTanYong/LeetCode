class Solution {
    public void moveZeroes(int[] nums) {
       int nonZeroIndex = 0; // Initialize the index for placing non-zero elements
        
        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                // If the current element is non-zero, move it to the next available position
                nums[nonZeroIndex] = nums[i];
                
                // Increment the index for placing non-zero elements
                nonZeroIndex++;
            }
        }
        
        // Fill the remaining positions with zeros
        for (int i = nonZeroIndex; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}