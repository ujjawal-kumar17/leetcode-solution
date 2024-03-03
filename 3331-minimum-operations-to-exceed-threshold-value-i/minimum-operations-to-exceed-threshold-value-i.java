class Solution {
    public int minOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int count = 0 ;
        int i = 0;
        while(i<nums.length && nums[i]<k){
            i++;
            count++;
        }
        return count;
        
    }
}