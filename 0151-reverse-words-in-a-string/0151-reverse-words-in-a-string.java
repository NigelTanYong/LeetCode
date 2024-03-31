class Solution {
    public String reverseWords(String s) {
        //split the string into words
        String[] words = s.trim().split("\\s+");
        
        //Reverse the order of the words
        StringBuilder reversed = new StringBuilder();
        for(int i = words.length-1; i>=0; i--){
            reversed.append(words[i]).append(" ");
        }
        // Remove the trailing space and return the result
        return reversed.toString().trim();
    }
}