// Last updated: 7/13/2026, 11:18:20 PM
// Another approach of solving the same basic Array question
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
14        for(int i = 2; i <= n ; i++){
15           if(i%2 == 0){
16            //for even index elements
17            arr[i] = arr[i/2];
18           }
19           else{
20            //for odd index elements
21            arr[i] = arr[i/2] + arr[(i/2)+1];
22           }
23           max = Math.max(max, arr[i]);
24        }
25       return max;
26    }
27}