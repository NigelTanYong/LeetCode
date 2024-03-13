class Solution {
    public boolean isSubsequence(String s, String t) {
        int i = 0; // Index for s
    int j = 0; // Index for t

    while (i < s.length() && j < t.length()) {
      if (s.charAt(i) == t.charAt(j)) {
        i++; // Move i only if characters match
      }
      j++; // Always move j to check the next character in t
    }

    return i == s.length(); // All characters of s must be found in t
  
    }
}