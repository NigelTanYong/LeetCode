class Solution {
    fun candy(ratings: IntArray): Int {
        val candies = IntArray(ratings.size){1} //base where all children gets 1
        for(i in 1 until ratings.size){
            if(ratings[i] > ratings[i-1]){
                candies[i] = candies[i-1] + 1
            }
        }
        //sking the last element and considering i+1
        for(i in ratings.size -2 downTo 0){
            if(ratings[i] > ratings[i+1]){
                candies[i] = maxOf(candies[i], candies[i+1]+1)
            }
        }
    return candies.sum()

    }
}

//use greedy algo

/*
1. intialise a intArray with size of ratings and base it with value 1
2. iterate from the second element till the end
3. check if current more than previous
4. then update cureent with the no. of candies more than previous by 1
5. another loop from the end by skip last element downTo 0
6. this time check if current is more than the next
7. if more, then get the max of either current or the next with additional one
8 return with a sum() of candies
*/