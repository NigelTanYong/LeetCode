class Solution {
    public String reverseVowels(String s) {
        char[] chars = s.toCharArray();
        int left = 0;
        int right=s.length() -1;
        char temp;
        
        while (left<right){
            if (isVowel(chars[left]) && isVowel(chars[right])){
                temp = chars[left];
                chars[left] = chars[right];
                chars[right] = temp;
                left++;
                right--;
            }
            else if (isVowel(chars[left])){
                right--;
            }
            else if (isVowel(chars[right])){
                left++;
            }
            else{
                left++;
                right--;
            }
        }
        return new String(chars);
    }
    private boolean isVowel(char c){
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
               c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }
}