// Last updated: 7/18/2026, 12:33:22 PM
// Using Hashmap and checking the distance between 2 duplicates using get index of the key as we are storing index of element in value not frequency count.
1class Solution {
2    public boolean containsNearbyDuplicate(int[] nums, int k) {
3        HashMap<Integer, Integer> distinct_num_to_index_map = new HashMap<>(nums.length * 2);
4
5
6        for(int i = 0; i< nums.length ; i++){
7            if(distinct_num_to_index_map.containsKey(nums[i])){
8                if( Math.abs( i - distinct_num_to_index_map.get(nums[i]) ) <= k)
9                    return true;
10                
11
12            }
13            distinct_num_to_index_map.put(nums[i] ,i);
14        }
15        return false;
16    }
17}