class Solution {
    public String gcdOfStrings(String str1, String str2) {
        //check if concatenation order matters
        if(!(str1+str2).equals(str2+str1))
            return "";
            
        // calculate gcd of lengths
        int gcd = gcd(str1.length(), str2.length());
        
        //return the common prefix of length gcd from str1
        return str1.substring(0, gcd); //gcd is the no. of characters to include
    }
    private int gcd(int a, int b){ // 6,4  4,2  2,0
        if(b==0)
            return a; //2
        return gcd(b, a%b);// 4,6%4  2, 4%2
    }
}