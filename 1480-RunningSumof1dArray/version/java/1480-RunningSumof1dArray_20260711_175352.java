// Last updated: 7/11/2026, 5:53:52 PM
// This Solution uses Prefix Sum pattern
1class Solution {
2    public int[] runningSum(int[] nums) {
3        for(int i = 1; i< nums.length ; i++){
4            nums[i] += nums[i-1];
5        }
6        return nums;
7    }
8}