class Solution {
    public int arraySign(int[] nums) {
        int countNegativeNumbers = 0;
        for (int i =0; i< nums.length; i++){
            if (nums[i] == 0)
                return 0;
            if (nums[i] < 0)
                countNegativeNumbers += 1;
        }

        if (countNegativeNumbers %2 == 0)
            return 1;
        return -1;
    }
}