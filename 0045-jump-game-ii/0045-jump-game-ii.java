class Solution {
    public int jump(int[] nums) {
        int jumps = 0;
        int currentEnd = 0;
        int farthest = 0;
        
        if(nums.length<=1)
            return 0;
        
        for(int i = 0; i< nums.length; i++){
            farthest = Math.max(farthest, i+nums[i]);
            
            if (i == currentEnd){
                jumps++;
                currentEnd = farthest;
                
                if(currentEnd >= nums.length -1)
                    break;
            }
        }
        return jumps;
    }
}