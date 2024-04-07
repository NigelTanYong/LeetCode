class Solution:
    def plusOne(self, digits: List[int]) -> List[int]:
        n = len(digits)
        # Start from the least significant digit
        for i in range(n - 1, -1, -1):
            if digits[i] < 9:
                # Increment the current digit and return the updated array
                digits[i] += 1
                return digits
            else:
                # If the current digit is 9, set it to 0 and propagate the carry
                digits[i] = 0
        # If all digits are 9, add a new digit 1 at the beginning
        return [1] + digits