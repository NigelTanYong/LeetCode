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
/*
1. initialise a candidate and counter
2. iterate through the array
3. overwrite candidate with the current element if count is 0
4. increment count if candidate is same as current element
5. if not same, deduct count
6. make another iteration for verification
7. check if the current element is same as candidate and increment count
8. out of loop check if count is more than floor of array size divide 2.
return candidate if so
else return -1
*/