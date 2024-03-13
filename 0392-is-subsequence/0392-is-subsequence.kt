class Solution {
    fun isSubsequence(s: String, t: String): Boolean {
        var i = 0 // Index for s
    var j = 0 // Index for t

    while (i < s.length && j < t.length) {
      if (s[i] == t[j]) {
        i++ // Move i only if characters match
      }
      j++ // Always move j to check the next character in t
    }

    return i == s.length // All characters of s must be found in t
  
    }
}