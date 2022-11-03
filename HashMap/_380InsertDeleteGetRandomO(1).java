class RandomizedSet {

    Set <String> set = new HashSet<>();
    List<Integer> list = new ArrayList<>();
    public RandomizedSet() {
    }
    
    public boolean insert(int val) {
        if(set.contains(val+"")){
            return false;
        }
        else{
            set.add(val+"");
            list.add(val);
            return true;
        }
    }
    
    public boolean remove(int val) {
        if(set.contains(val+"")){
            set.remove(val+"");
            list.remove(new Integer(val));
            return true;
        }
        else{
            return false;
        }
    }
    
    public int getRandom() {
        int r=(int)(Math.random()*set.size());
        return list.get(r);
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */