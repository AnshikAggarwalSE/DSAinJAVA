// Last updated: 7/13/2026, 11:11:06 PM
// Normal Array problem asked in infosys
1class Solution {
2    public int getMaximumGenerated(int n) {
3         
4        if(n < 2){
5            return n;
6        }
7        
8        int[] arr = new int[n + 1];
9        int max = 1;
10
11        arr[0]= 0;
12        arr[1]= 1;
13        
14        for(int i = 1; i <= n/2 ; i++){
15           arr[i*2] = arr[i];
16           if( (i*2+1) <= n ){
17            arr[i*2+1] = arr[i] + arr[i+1];
18            if(max < arr[i*2+1]){
19                max = arr[i*2+1];
20            }
21          }
22           if(max < arr[i*2]){
23               max = arr[i*2];
24           }
25        }
26       return max;
27    }
28}