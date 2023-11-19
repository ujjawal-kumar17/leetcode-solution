class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        Map<Integer,String> ans = new HashMap<>();
        for(int i=0;i<heights.length;i++){
            ans.put(heights[i],names[i]);
        }
        Arrays.sort(heights);
        String[] result = new String[heights.length];
        int k=0;
        for(int j=heights.length-1;j>=0;j--){
            result[k]=ans.get(heights[j]);
            k++;
        }
        return result;
    }
}