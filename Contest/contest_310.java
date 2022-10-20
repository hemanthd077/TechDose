class Solution {
    public int partitionString(String s) {
        int count = (s.isEmpty()) ? 0 : 1;
        int len=s.length();
        HashSet<Character> l = new HashSet<Character>();
        for (int i = 0; i < len; i++) {
            if (l.contains(s.charAt(i))) { 
                l.clear(); 
                count++;
            }
            l.add(s.charAt(i)); 
        }
        return count;
    }
}
