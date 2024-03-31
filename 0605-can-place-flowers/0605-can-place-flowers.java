class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if(n==0)
            return true; //0 flowers to plant
        for(int i=0; i< flowerbed.length; i++){
           if (flowerbed[i] == 0  // Check if current plot is empty
          && (i == 0 || flowerbed[i - 1] == 0)  // Check no flower to the left
          && (i == flowerbed.length - 1 || flowerbed[i + 1] == 0)){
                flowerbed[i] =1;
                n--;
                if(n==0){
                    return true; //planted all plants
                }
            }
        }
        return false;
    }
}