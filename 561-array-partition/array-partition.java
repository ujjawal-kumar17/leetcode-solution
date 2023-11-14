class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int result= 0;
        for(int i=0;i<nums.length;i+=2){
            int j = i+1;
            result=result+Math.min(nums[i],nums[j]);
        }
        return result;
    }
}