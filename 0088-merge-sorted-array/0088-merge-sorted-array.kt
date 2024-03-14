class Solution {
    fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int): Unit {
       var i = m - 1 // Pointer for nums1
        var j = n - 1 // Pointer for nums2
        var k = m + n - 1 // Pointer for the merged array
        
        for (index in k downTo 0) {
            if (j < 0) {
                break // No elements left in nums2
            }
            
            if (i >= 0 && nums1[i] > nums2[j]) {
                nums1[index] = nums1[i]
                i--
            } else {
                nums1[index] = nums2[j]
                j--
            }
        }
    }
}