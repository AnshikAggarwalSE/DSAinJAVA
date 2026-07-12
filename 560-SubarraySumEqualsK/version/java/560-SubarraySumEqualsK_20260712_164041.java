// Last updated: 7/12/2026, 4:40:41 PM
/*
 * Problem approach using HashMap and prefixSum
 * prefixSum - k checked in map.containsKey
*/

1class Solution {
2    public int subarraySum(int[] nums, int k) {
3        int prefixSum = 0;
4        int countTotalSubarray = 0;
5        HashMap<Integer, Integer> mp = new HashMap<>();
6
7        mp.put(0,1);
8
9        for(int i = 0 ; i<nums.length; i++){
10            prefixSum += nums[i];
11
12            if(mp.containsKey(prefixSum - k)){
13                countTotalSubarray += mp.get(prefixSum-k);
14            }
15
16            mp.put(prefixSum, mp.getOrDefault(prefixSum , 0)+1);
17        }
18        return countTotalSubarray;
19    }
20}