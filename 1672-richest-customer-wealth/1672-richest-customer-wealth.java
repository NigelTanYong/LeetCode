class Solution {
    public int maximumWealth(int[][] accounts) {
        int latestMaxWealth = 0;
        for(int[] customer: accounts) //foreach loop, accounts is the iterable
        {
            int curWealth = 0;
            for(int bank:customer){
                curWealth+=bank;
            }
            latestMaxWealth = Math.max(latestMaxWealth,curWealth);
        }
        return latestMaxWealth;
    }
}