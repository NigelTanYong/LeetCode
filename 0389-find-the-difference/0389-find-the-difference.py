class Solution:
    def findTheDifference(self, s: str, t: str) -> str:
        sorted_s = sorted(s)
        sorted_t = sorted(t)
        
        if not sorted_s:  # Check if sorted_s is empty
            return sorted_t[-1]
        
        for i in range(len(sorted_s)):  # Iterate over indices of sorted_s
            if sorted_t[i] != sorted_s[i]:
                return sorted_t[i]
        
        # If no difference found yet, the extra character is the last character of t
        return sorted_t[-1]
            