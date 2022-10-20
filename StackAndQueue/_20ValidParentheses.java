class Solution {
    public boolean isValid(String s) {
        Stack<Character> st=new Stack<Character>();
        for(char a:s.toCharArray()){
            if(!st.isEmpty() && (st.peek()==a-1 || st.peek()==a-2))
                st.pop();
            else
                st.push(a);
        }
        return st.isEmpty();
    }
}