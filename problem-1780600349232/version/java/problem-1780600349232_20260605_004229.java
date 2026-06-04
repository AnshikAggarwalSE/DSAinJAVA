// Last updated: 6/5/2026, 12:42:29 AM
1import java.util.*;
2
3class Solution {
4    public long zeroFilledSubarray(int[] nums) {
5        // freq maps a streak length to how many times we have seen that length.
6        // It is not required for the final answer, but shows the “hash‑map” flavor.
7        Map<Integer, Integer> freq = new HashMap<>();
8
9        int curLen = 0;          // length of the current consecutive‑zero block
10        long ans = 0L;           // total number of zero‑filled subarrays (use long for large answers)
11
12        for (int x : nums) {
13            if (x == 0) {
14                // Still inside a zero streak → extend it by one
15                curLen++;
16            } else {
17                // Non‑zero breaks the streak
18                curLen = 0;
19            }
20
21            // Record the occurrence of this exact streak length
22            freq.put(curLen, freq.getOrDefault(curLen, 0) + 1);
23
24            // Every zero that ends at the current index creates `curLen` new subarrays
25            ans += curLen;
26        }
27
28        // Optional: print the distribution of streak lengths
29        // for (Map.Entry<Integer,Integer> e : freq.entrySet()) {
30        //     System.out.println("Streak length " + e.getKey() + " appeared " + e.getValue() + " times");
31        // }
32
33        return ans;
34    }
35}
36