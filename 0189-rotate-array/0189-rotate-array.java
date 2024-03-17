class Solution {
    public void rotate(int[] nums, int k) {
        
        k = k % nums.length;
        
        //reverse all elements
        reverse(nums, 0, nums.length - 1);
        //reverse first k elements
        reverse (nums, 0, k-1);
        //reverse remaining
        reverse(nums, k, nums.length - 1);
    }
    private void reverse(int[] nums, int start, int end){
        while(start<end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}