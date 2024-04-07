class Solution:
    def isMonotonic(self, nums: List[int]) -> bool:
        increasing = decreasing = True
        
        # Check if the array is monotone increasing
        for i in range(1, len(nums)):
            if nums[i] < nums[i - 1]:
                increasing = False
                break
                
        # Check if the array is monotone decreasing
        for i in range(1, len(nums)):
            if nums[i] > nums[i - 1]:
                decreasing = False
                break
                
        # Return True if either increasing or decreasing is True
        return increasing or decreasing