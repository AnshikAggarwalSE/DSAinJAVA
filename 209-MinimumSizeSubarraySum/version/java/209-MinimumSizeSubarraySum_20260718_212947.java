// Last updated: 7/18/2026, 9:29:47 PM
/*
 * using Sliding window and prefixSum with 2 pointers left and right and size of window is right - left + 1;
 * using TC O(n2) as for loop inside while loop
*/

1class Solution {
2    public int minSubArrayLen(int target, int[] nums) {
3        int window_size = Integer.MAX_VALUE;
4        int sum = 0;
5        int left_index = 0;
6        
7
8        for( int right_index = 0 ; right_index < nums.length ; right_index ++){
9            sum += nums[right_index];
10
11            while(sum >= target){
12                window_size = Math.min(window_size , right_index - left_index + 1);
13                sum -= nums[left_index];
14                left_index ++;
15            }
16        }
17        return window_size == Integer.MAX_VALUE ? 0 : window_size;
18    }
19}