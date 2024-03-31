class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        n = len(nums)
        answer = [1] * n  # Initialize the answer array with 1s

       # Calculate prefix products from left to right
        prefix = 1
        for i in range(n):
            answer[i] *= prefix
            prefix *= nums[i]

        # Calculate suffix products from right to left
        suffix = 1
        for i in reversed(range(n)):
            answer[i] *= suffix
            suffix *= nums[i]

        return answer