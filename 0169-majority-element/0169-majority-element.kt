class Solution {
    fun majorityElement(nums: IntArray): Int {
        var candidate = 0
        var count = 0
        
        //find candidate
        for(num in nums){
            if(count == 0){
                candidate = num
            }
            if(num==candidate){
                count++
            }
            else{
                count--
            }
        }
        //verify candidate
        for (num in nums) {
            if (num == candidate) {
                count++
            }
        }
        if(count>nums.size/2)
            return candidate
        else
            return -1
    }
}
// Boyer-Moore Majority Vote Algorithm