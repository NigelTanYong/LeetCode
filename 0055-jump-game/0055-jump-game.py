class Solution(object):
    def canJump(self, nums):
        """
        :type nums: List[int]
        :rtype: bool
        """
        max_reach = 0 
        
        for i in range(len(nums)):
            # If current index is beyond the max reach, we can't proceed further
            if i>max_reach:
                return False
            # Update max reach
            max_reach = max(max_reach, i+nums[i])
            # If we can reach or exceed the last index, return True
            if max_reach >= len(nums)-1:
                return True
        return False