class Solution {
    public int[] runningSum(int[] nums) {
        int[] results = new int[nums.length];
        results[0] = nums[0]; 
        //cannot put 0 in the forloop to prevent out of bound
        for (int i=1; i< nums.length; i++){
            results[i]=nums[i]+results[i-1];
        }
        return results;
        
    }
}
// space complexity is O(1) -no data structure created
// time complexity O(n) -run through the arrays once