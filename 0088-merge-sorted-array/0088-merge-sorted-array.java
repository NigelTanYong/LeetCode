class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m-1;
        int j = n-1;
        int k = m + n -1;
        
        for(int a = k; a >= 0; a--){
            if(j<0){
                break;
            }
            if(i >= 0 && nums1[i] > nums2[j]){
                nums1[a] = nums1[i];
                i--;
            }
            else{
                nums1[a] = nums2[j];
                j--;
            }
        }
    }
}