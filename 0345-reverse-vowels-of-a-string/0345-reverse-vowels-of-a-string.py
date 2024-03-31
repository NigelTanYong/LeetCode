class Solution:
    def reverseVowels(self, s: str) -> str:
        vowels = set("aeiouAEIOU")
        str_list = list(s)
        left=0
        right=len(str_list)-1
        
        while left<right:
           
            if str_list[left] in vowels and str_list[right] in vowels:
                str_list[left], str_list[right] = str_list[right], str_list[left]
                left+=1
                right-=1
            elif str_list[left] in vowels:
                right-=1
            elif str_list[right] in vowels:
                left+=1
            else:
                left+=1
                right-=1
        return ''.join(str_list)