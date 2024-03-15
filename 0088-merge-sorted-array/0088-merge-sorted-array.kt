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
//two pointer approach
/*
1. create index on last items of both arrays
2. have another another that is the max no. of output elements (m+n-1)
3. iterate from the end to 0
    4. check if the smaller array have item
    5. check if it is not the 1st element of the longer array and compare values
    6. if values of longer array is larger than shorter array, overwrite the longer array with current longer array value and iterate down the longer array
    7. if values of longer array is equal or lesser than shorter array and there are still elements of longer array on the left, iterate dwon the shorter array
*/