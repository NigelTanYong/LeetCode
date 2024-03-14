class Solution {
    public int removeDuplicates(int[] nums) {
     if (nums.length ==0) return 0; // Handle edge case when array is empty
        
        int k = 1; // Pointer to keep track of the next position to write the unique element
        int left = 1; // Pointer to iterate through the array
        
        while (left < nums.length) {
            // If the current element is different from the previous one, copy it to the next position
            if (nums[left] != nums[left - 1]) {
                nums[k] = nums[left];
                k++; // Move k to the next position
            }
            left++; // Move left to the next element
        }
        
        return k; // k represents the number of unique elements
    }
}