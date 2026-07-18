// Last updated: 7/18/2026, 11:59:11 AM
// Just optimized it further using hashmap just space optimization setting the size of hashmap as nums.size * 2
1class Solution {
2    public boolean containsDuplicate(int[] nums) {
3        if(nums.length == 1){
4            return false;
5        }
6        HashMap<Integer, Integer> elementFreq = new HashMap<>(nums.length * 2);
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