class Solution {
    public String largestWordCount(String[] messages, String[] senders) {
        HashMap<String,Integer> a = new HashMap<>();
        int len=senders.length,max=0;
        String res="";
        for(int i=0;i<len;i++){
            String[] words=messages[i].split(" ");
            
            int freq=a.getOrDefault(senders[i],0)+words.length;
            a.put(senders[i],freq);
            if(a.get(senders[i])>max){
                max=a.get(senders[i]);
                res=senders[i];
            }
            else if(a.get(senders[i])==max && res.compareTo(senders[i])<0){
                res=senders[i];
            } 
        }
        return res;
    }
}
