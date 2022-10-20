class Solution {
    public int maximumSum(int[] nums) {
        HashMap<Integer,Integer> a = new HashMap<>();
        int result=-1;
        for(int i: nums){
            int key = sum(i);
            if(!a.containsKey(key)){
                a.put(key,i);
            }
            else{
                result = Math.max(result,a.get(key)+i);
                a.put(key,Math.max(a.get(key),i));
            }
        }
        return result;
    }
    int sum(int a){
        int total=0;
        while(a>0){
            total+=a%10;
            a/=10;
        }
        return total;
    }
}