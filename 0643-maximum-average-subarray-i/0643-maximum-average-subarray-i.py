class Solution:
    def findMaxAverage(self, nums: List[int], k: int) -> float:
        num_sum = sum(nums[:k])
        max_sum = num_sum
        
        for i in range(k, len(nums)):
            num_sum += nums[i] - nums[i-k] # Add the next element and remove the first element
            max_sum =max(max_sum, num_sum)
        return max_sum / k