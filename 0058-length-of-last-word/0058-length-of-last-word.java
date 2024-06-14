class Solution {
    public int lengthOfLastWord(String s) {
        // Step 1: Trim any trailing spaces from the string
        s = s.trim();
        
        // Step 2: Split the string into an array of words
        String[] words = s.split(" ");
        
        // Step 3: Return the length of the last word in the array
        if (words.length > 0) {
            return words[words.length - 1].length();
        } else {
            return 0;  // In case the string is empty or contains only spaces
        }
    }
}