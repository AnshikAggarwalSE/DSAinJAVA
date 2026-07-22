// Last updated: 7/22/2026, 7:29:59 AM
// Using Stack not monotonic Stack only stack peek pop and isEmpty methods and String toCharArray() method for traversing characters in string, or u can use s.charAt(i); for i< s.length()
1class Solution {
2    public boolean isValid(String s) {
3        
4        Stack<Character> bracket_stack = new Stack<>();
5
6        for(char ch : s.toCharArray()){
7            if(ch == '(' || ch == '{' || ch=='['){
8                bracket_stack.push(ch);
9            }
10            else{
11                if(bracket_stack.isEmpty())
12                    return false;
13                else if( (ch == ')' && bracket_stack.peek() == '(') || (ch =='}' && bracket_stack.peek() == '{') || (ch ==']' && bracket_stack.peek() == '[') )
14                    bracket_stack.pop();
15                else
16                    return false;
17            }
18        }
19        /*if(bracket_stack.isEmpty())
20            return true;
21        else
22            return false;
23        */
24        return bracket_stack.isEmpty();
25    }
26}