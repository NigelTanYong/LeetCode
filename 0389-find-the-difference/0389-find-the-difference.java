class Solution {
    public char findTheDifference(String s, String t) {
        char[] sortedS = s.toCharArray();
        char[] sortedT = t.toCharArray();
        
        Arrays.sort(sortedS);
        Arrays.sort(sortedT);
        
        if (sortedS.length == 0) { // Check if sortedS is empty
            return sortedT[sortedT.length - 1];
        }
        
        for (int i = 0; i < sortedS.length; i++) { // Iterate over indices of sortedS
            if (sortedT[i] != sortedS[i]) {
                return sortedT[i];
            }
        }
        
        // If no difference found yet, the extra character is the last character of t
        return sortedT[sortedT.length - 1];
    }
}