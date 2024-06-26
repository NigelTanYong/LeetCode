class Solution {
    fun twoSum(numbers: IntArray, target: Int): IntArray {
        var left = 0
        var right = numbers.lastIndex
        
        while(left<right){
            val sum = numbers[left] + numbers[right]
            if(sum == target){
                return intArrayOf(left+1, right+1)
            }
            else if(sum<target)
                left++
            else{
                right--
            }
        }
        return intArrayOf(-1, -1) // Not found

    }
}