class Solution {
    public int maximumGroups(int[] grades) {
        int k=0,len=grades.length,total=0;
        while(total+k+1 <=len){
            total+=++k;
        }
        return k;
    }
}