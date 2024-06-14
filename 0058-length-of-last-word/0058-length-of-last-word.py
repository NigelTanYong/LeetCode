class Solution(object):
    def lengthOfLastWord(self, s):
        """
        :type s: str
        :rtype: int
        """
        # Step 1: Strip any trailing spaces from the string
        s = s.rstrip()

        # Step 2: Split the string into a list of words
        words = s.split()

        # Step 3: Return the length of the last word in the list
        if words:
            return len(words[-1])
        else:
            return 0  # In case the string is empty or contains only spaces
        