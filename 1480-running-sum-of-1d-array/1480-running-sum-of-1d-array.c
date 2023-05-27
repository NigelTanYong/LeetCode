/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* runningSum(int* nums, int numsSize, int* returnSize){
    // Allocate memory for the running sum array
    int* runningSums = (int*)malloc(numsSize * sizeof(int)); 
    // Set the value of returnSize to numsSize
    *returnSize = numsSize; 
    
    int sum = 0;
    for (int i = 0; i < numsSize; i++) {
        sum += nums[i]; // Calculate the running sum
        runningSums[i] = sum; // Store the running sum in the array
    }
    
    return runningSums; // Return the running sum array
}