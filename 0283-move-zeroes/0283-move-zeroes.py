class Solution:
    def moveZeroes(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        nonzeroindex =0
        for i in range(len(nums)):
            if nums[i] != 0:
                nums[nonzeroindex] = nums[i]
                nonzeroindex+=1
        for i in range(nonzeroindex, len(nums)):
            nums[i] = 0