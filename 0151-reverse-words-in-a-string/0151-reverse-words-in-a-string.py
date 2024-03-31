class Solution:
    def reverseWords(self, s: str) -> str:
        #split the string into words
        words = s.strip().split()
        #reverse the order of the words
        reversed_words = reversed(words)
        #join the words back together with a single space between each word
        reversed_strings = ' '.join(reversed_words)
        return reversed_strings