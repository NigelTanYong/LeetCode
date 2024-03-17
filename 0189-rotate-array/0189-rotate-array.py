class Solution:
    def rotate(self, nums: List[int], k: int) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        
        #calculate effective rotation amount by taking modulo
        k = k%len(nums)
        
        #reverse entire array
        self.reverse(nums, 0, len(nums)-1)
        #reverse the first k elements
        self.reverse(nums, 0, k-1)
        #reverse the remaining - to put back the remaining in same relative positions
        self.reverse(nums, k, len(nums)-1)
        
    def reverse(self, nums:List[int], start:int, end: int) -> None:
        while start<end:
            nums[start], nums[end] = nums[end], nums[start]
            start += 1
            end -= 1
            
#         #reverse entire array
#         start, end = 0, len(nums) - 1
#         while start<end:
#             nums[start], nums[end] = nums[end], nums[start]
#             start += 1
#             end -= 1
            
#         #reverse first k elements
#         start, end = 0, k-1
#         while start<end:
#             nums[start], nums[end] = nums[end], nums[start]
#             start += 1
#             end -= 1
        
#         #reverse the remaining elements
#         start, end = k, len(nums) - 1
#         while start<end:
#             nums[start], nums[end] = nums[end], nums[start]
#             start += 1
#             end-= 1