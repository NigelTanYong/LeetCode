class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        
        for (int i = n-1; i>-1; i--){
            if (digits[i]<9){
                digits[i] +=1;
                return digits;
            }
            else{
                digits[i] = 0;
            }
        }
        int[] result = new int[n + 1];
        result[0] = 1; // Set the first digit to 1
        return result;
    }
}