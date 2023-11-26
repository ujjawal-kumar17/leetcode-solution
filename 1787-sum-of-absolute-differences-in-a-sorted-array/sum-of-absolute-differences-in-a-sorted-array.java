class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int rSum = 0;
        int lSum = 0;
        int[] sum = new int[nums.length];
        for(int i = 0;i<nums.length;i++){
            rSum += nums[i];
        }
        
        int n = nums.length;
        int s = 0;
        for(int i = 0;i<nums.length;i++){
            rSum -= nums[i];
            n--;
            sum[i] = (rSum-n*nums[i]) + (s*nums[i] - lSum);
            lSum += nums[i];
            s++;
            
        }
        return sum;
    }
}