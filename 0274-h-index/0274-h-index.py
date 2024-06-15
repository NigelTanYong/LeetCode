class Solution(object):
    def hIndex(self, citations):
        """
        :type citations: List[int]
        :rtype: int
        """
        # Sort the citations array in descending order
        citations.sort(reverse=True)
        
        # Iterate through the sorted citations array
        h = 0
        for i in range(len(citations)):
            # If the number of citations is greater than or equal to the index + 1 (h), update h
            if citations[i] >= i + 1:
                h = i + 1
            else:
                break
        
        return h