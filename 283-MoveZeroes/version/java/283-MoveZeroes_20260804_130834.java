// Last updated: 8/4/2026, 1:08:34 PM
// Normal Array and extra pointer approach with swapping
1class Solution {
2    public void moveZeroes(int[] nums) {
3        int start = 0;
4
5        for(int i = 0; i< nums.length ; i++){
6            if(nums[i] != 0){
7                int temp = nums[start];
8                nums[start] = nums[i];
9                nums[i] = temp;
10                start++;
11            }
12        }
13        return;
14    }
15}