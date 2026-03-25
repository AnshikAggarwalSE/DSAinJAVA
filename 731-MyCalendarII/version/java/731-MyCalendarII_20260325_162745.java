// Last updated: 3/25/2026, 4:27:45 PM
// Pattern used: Line Sweep Algorithm
1class MyCalendarTwo {
2    private List<int[]> FirstBooking;
3    private List<int[]> DoubleBooking;
4
5    public MyCalendarTwo() {
6        FirstBooking = new ArrayList<>(); 
7        DoubleBooking = new ArrayList<>(); 
8    }
9    
10    public boolean book(int startTime, int endTime) {
11        // first check for triple booking in DoubleBooking list if overlaps comes then return false, and reject the interval
12        for(int[] intervals: DoubleBooking){
13            if(Math.max( startTime, intervals[0] ) < Math.min( endTime , intervals[1] ))
14            //Triple booking 2nd overlap found;
15            return false;
16        }
17
18        // Second check for double booking in FirstBooking list if overlaps comes then return true, and add the interval in DoubleBooking list
19        for(int[] interval: FirstBooking ){
20            if(Math.max( startTime, interval[0] ) < Math.min( endTime , interval[1] )){
21            //Double booking occurs 1st overlap founded;
22            DoubleBooking.add( new int[]{Math.max(startTime,interval[0]) , Math.min(endTime , interval[1])} );
23            }
24        }
25
26        //third add new bookings in FirstBooking list 
27        FirstBooking.add( new int[]{startTime, endTime} );
28        return true;
29    }
30}
31
32/**
33 * Your MyCalendarTwo object will be instantiated and called as such:
34 * MyCalendarTwo obj = new MyCalendarTwo();
35 * boolean param_1 = obj.book(startTime,endTime);
36 */