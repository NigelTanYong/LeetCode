class Solution {
    fun maxArea(height: IntArray): Int {
        var left = 0
        var right = height.size - 1
        var maxArea = 0
        
        while (left < right) {
            val area = Math.min(height[left], height[right]) * (right - left)
            maxArea = maxOf(maxArea, area)
            
            if (height[left] < height[right]) {
                left++
            } else {
                right--
            }
        }
        
        return maxArea
        
    }
}