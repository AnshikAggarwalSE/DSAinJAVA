// Last updated: 7/14/2026, 12:05:55 AM
// PrefixSum + hashmap where checks remainder = prefixSum %k and for handling negative integers use (prefixSum %k +k )%k and then the key of hashmap is the remainder and its value is not the frequency but the index value
1class Solution {
2    public boolean checkSubarraySum(int[] nums, int k) {
3        long prefixSum = 0;
4        int countTotalSubarray = 0;
5        HashMap<Integer,Integer> countRem = new HashMap<>();
6        countRem.put(0,-1);
7        //Here the value of Hashmap countRem stores the index value i of Remainder at i index
8
9        for(int i = 0; i<nums.length ; i++){
10            prefixSum += nums[i];
11
12            int remainder = (int) (((prefixSum % k)+k) %k);
13            if(countRem.containsKey(remainder)){
14                if(i- countRem.get(remainder) >= 2){
15                    return true;
16                }
17            }
18            else{
19                countRem.put(remainder, i);
20            }
21            
22        }
23        return false;
24    }
25}