class Solution:
    def kidsWithCandies(self, candies: List[int], extraCandies: int) -> List[bool]:
        b_list=[]
        max_candies = max(candies)
        i=0
        while i<len(candies):
            if not candies[i]+extraCandies >= max_candies:
                b_list.append(False)
            else:
                b_list.append(True)
            i+=1
        return b_list
    # OR
        # max_candies = max(candies)  # Find the maximum number of candies initially
        # result = [candy + extraCandies >= max_candies for candy in candies]
        # return result