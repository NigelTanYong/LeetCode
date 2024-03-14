class Solution {
    fun threeSum(nums: IntArray): List<List<Int>> {
         nums.sort()
        val result = mutableListOf<List<Int>>()

        for (i in nums.indices) {
            // Skip duplicate triplets
            if (i > 0 && nums[i] == nums[i - 1]) continue
            
            var left = i + 1
            var right = nums.size - 1
            
            while (left < right) {
                val sum = nums[i] + nums[left] + nums[right]
                
                if (sum == 0) {
                    result.add(listOf(nums[i], nums[left], nums[right]))
                    // Skip duplicate elements
                    while (left < right && nums[left] == nums[left + 1]) left++
                    while (left < right && nums[right] == nums[right - 1]) right--
                    left++
                    right--
                } else if (sum < 0) {
                    left++
                } else {
                    right--
                }
            }
        }
        
        return result
    }
}