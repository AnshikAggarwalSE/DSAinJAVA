// Last updated: 7/18/2026, 11:57:32 AM
// Using only HashMap to check the duplicate
1class Solution {
2    public boolean containsDuplicate(int[] nums) {
3        if(nums.length == 1){
4            return false;
5        }
6        HashMap<Integer, Integer> elementFreq = new HashMap<>();
7
8        for(int i = 0; i< nums.length; i++){
9            if(elementFreq.containsKey(nums[i])){
10                return true;
11            }
12            elementFreq.put(nums[i], 0);
13        }
14        return false;
15    }
16}