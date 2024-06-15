class Solution {
    public int hIndex(int[] citations) {
        // Convert int[] to Integer[] to use Collections.reverseOrder()
        Integer[] citationsArray = Arrays.stream(citations).boxed().toArray(Integer[]::new);

        // Sort the citations array in descending order
        Arrays.sort(citationsArray, Collections.reverseOrder());

        // Iterate through the sorted citations array to calculate the h-index
        int h = 0;
        for (int i = 0; i < citationsArray.length; i++) {
            if (citationsArray[i] >= i + 1) {
                h = i + 1;
            } else {
                break;
            }
        }

        return h;
        
    }
}