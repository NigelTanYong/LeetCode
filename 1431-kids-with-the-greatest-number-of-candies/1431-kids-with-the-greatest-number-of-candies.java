class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> b_list = new ArrayList<>();
        int maxCandies = getMax(candies);
        for(int i =0; i<candies.length; i++){
            if(candies[i]+extraCandies>=maxCandies)
                b_list.add(true);
            else
                b_list.add(false);
        }
        return b_list;
        
    }
    private int getMax(int[] candies){
        int maxCandies = 0;
        for (int i=0; i<candies.length; i++){
            if(candies[i]>maxCandies)
                maxCandies=candies[i];
        }
        return maxCandies;
    }
}