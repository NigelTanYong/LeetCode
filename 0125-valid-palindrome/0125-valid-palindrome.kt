class Solution {
    fun isPalindrome(s: String): Boolean {
        //convert to lowercase and remove non-alphanumeric char
        val modifiedString = s.toLowerCase().filter{it.isLetterOrDigit()}
        return modifiedString == modifiedString.reversed()
    }
}