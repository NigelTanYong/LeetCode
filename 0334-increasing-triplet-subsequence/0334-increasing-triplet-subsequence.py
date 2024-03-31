class Solution:
    def increasingTriplet(self, nums: List[int]) -> bool:
        first = second = float('inf')  # Initialize first and second to positive infinity
        for num in nums:
            if num <= first:
                first = num
            elif num <= second:
                second = num
            else:
                return True  # Found a triplet (first < second < num)
        return False  # No increasing triplet found