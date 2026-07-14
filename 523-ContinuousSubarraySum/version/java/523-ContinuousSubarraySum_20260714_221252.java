// Last updated: 7/14/2026, 10:12:52 PM
// 2 pointers Merge sorted array using 3 pointers and starting from backside
1class Solution {
2    public void merge(int[] nums1, int m, int[] nums2, int n) {
3        int end1 = m-1;
4        int end2 = n-1;
5
6        for(int end3 = (m+n-1); end3 >= 0 ; end3--){
7            if(end2 == -1 || end3 == end1){
8                return;
9            }
10            else if( n == 0){
11                return;
12            }
13            else if(m == 0 || end1 == -1){
14                nums1[end3] = nums2[end2];
15                end2 --;
16            }
17            else if(nums1[end1] <= nums2[end2]){
18                nums1[end3] = nums2[end2];
19                end2 --;
20            }
21            else{
22                nums1[end3] = nums1[end1];
23                end1--;
24            }
25        }
26        return;
27    }
28}