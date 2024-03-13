class Solution {
    public boolean isPalindrome(String s) {
        String modifiedString = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        return modifiedString.equals(new StringBuilder(modifiedString).reverse().toString());
    
    }
}