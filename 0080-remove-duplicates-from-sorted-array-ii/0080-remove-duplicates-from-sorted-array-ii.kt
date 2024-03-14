class Solution {
    fun removeDuplicates(nums: IntArray): Int {
       if (nums.size <= 2) return nums.size // Handle edge cases when array has 0 or 1 elements
        
        var k = 2 // Pointer to keep track of the next position to write the unique element
        
        for (i in 2 until nums.size) {
            // If the current element is different from the element two positions back,
            // copy it to the next position
            if (nums[i] != nums[k - 2]) {
                nums[k] = nums[i]
                k++ // Move k to the next position
            }
        }
        
        return k // k represents the number of unique elements
    }
}