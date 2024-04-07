class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
         Arrays.sort(arr);
        if (arr.length ==0)
            return false;
        
        int difference = arr[1]-arr[0];
        
        for (int i=0; i< arr.length-1; i++){
            if ((arr[i+1] - arr[i]) != difference)
                return false;
            }
        return true;
    }
}