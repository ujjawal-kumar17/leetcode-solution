class TimeMap {
    class Tval{
        String val;
        int time;
        Tval(String x, int y){
            val = x; time = y; 
        }
    }
    Map<String,ArrayList<Tval>> map;
    /** Initialize your data structure here. */
    public TimeMap() {
        map = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        if(!map.containsKey(key)) map.put(key,new ArrayList<>());
        map.get(key).add(new Tval(value,timestamp));
    }
    
    public String get(String key, int timestamp) {
        int ind = binarySearch(map.getOrDefault(key,new ArrayList<Tval>()),timestamp);
        if(ind == -1) return "";
        return map.get(key).get(ind).val;
    }
    
    public int binarySearch(ArrayList<Tval> list,int t){
        int l = 0,r = list.size() - 1,ind = -1;
        if(r == -1) return r;
        while(l <= r){
            int mid = l + (r - l)/2;
            int x = list.get(mid).time;
            if(x == t) return mid;
            else if(x > t) r = mid - 1;
            else {
                l = mid + 1;
                ind = mid;
            }
        }
        return ind;
    }
    
}

/**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap obj = new TimeMap();
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 */