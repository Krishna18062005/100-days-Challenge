// //leet code contest solution

// Q1. Final Array State After K Multiplication Operations I
// Solved
// Easy
// 3 pt.
// You are given an integer array nums, an integer k, and an integer multiplier.

// You need to perform k operations on nums. In each operation:

// Find the minimum value x in nums. If there are multiple occurrences of the minimum value, select the one that appears first.
// Replace the selected minimum value x with x * multiplier.
// Return an integer array denoting the final state of nums after performing all k operations.
class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        for(int i=0;i<k;i++){
            int mi=0;
            int min=nums[0];
            for(int j=0;j<nums.length;j++){
                if(min>nums[j]){
                    mi=j;
                    min=nums[j];
                }
            }
            nums[mi]*=multiplier;

        }
        return nums;
    }
}
//
