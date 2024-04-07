class Solution:
    def canMakeArithmeticProgression(self, arr: List[int]) -> bool:
        sorted_arr = sorted(arr)
        if len(sorted_arr) ==0:
            return False
        
        difference = sorted_arr[1]-sorted_arr[0]
        
        for num in range(len(sorted_arr)-1):
            if (sorted_arr[num+1] - sorted_arr[num]) != difference:
                return False
        return True
            