// Last updated: 7/11/2026, 6:12:41 PM
/*
 * It uses PrefixSum approach where the constructor has the logic of prefix Sum
 * The constructor runs exactly once when the object is created. It loops through the array one time to build the prefix array, taking O(N) time once ; when the object is created. 
 * It loops through the array one time to build the prefix array, taking O(N) time. 
 * After that, every single query to sumRange is just a basic mathematical subtraction (prefix[right] - prefix[left - 1]), which executes instantly in O(1) constant time.
 * For "M" queries, the total time complexity drops drastically to 
 * O(N + M)
*/

1class NumArray {
2
3    private int[] nums;
4    private int[] prefixSum;
5
6    public NumArray(int[] nums) {
7        this.nums = nums;
8        prefixSum = new int[nums.length];
9
10        prefixSum[0] = nums[0]; 
11        for(int i = 1; i< nums.length ; i++){
12            prefixSum[i] = prefixSum[i-1] + nums[i];
13        }
14
15    }
16    
17    public int sumRange(int left, int right) {
18        if(left == 0){
19            return prefixSum[right];
20        }
21        return prefixSum[right] - prefixSum[left -1];
22    }
23}
24
25/**
26 * Your NumArray object will be instantiated and called as such:
27 * NumArray obj = new NumArray(nums);
28 * int param_1 = obj.sumRange(left,right);
29 */