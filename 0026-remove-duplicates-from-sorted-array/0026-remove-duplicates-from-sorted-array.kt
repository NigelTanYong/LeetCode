class Solution {
    fun removeDuplicates(nums: IntArray): Int {
        if (nums.isEmpty()) return 0 // Handle edge case when array is empty
        
        var k = 1 // Pointer to keep track of the next position to write the unique element
        var left = 1 // Pointer to iterate through the array
        
        while (left < nums.size) {
            // If the current element is different from the previous one, copy it to the next position
            if (nums[left] != nums[left - 1]) {
                nums[k] = nums[left]
                k++ // Move k to the next position
            }
            left++ // Move left to the next element
        }
        
        return k // k represents the number of unique elements
    }
}

/*1. check if there is anything in the array, i f nothing return 0
    2. initialise a counter that starts at 2nd position
    3 initialise a left pointer that starts at 2nd position
    4. loop while left< size of num array
    5. check if element from left not same as element before left
    6. overwrite into array and move to next k position
    7.iterate the left

*/