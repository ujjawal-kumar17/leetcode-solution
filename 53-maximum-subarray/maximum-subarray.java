class Solution {
    public int maxSubArray(int[] nums) {
    int currentArr = 0;
    int maxSum = Integer.MIN_VALUE;
    for(int i=0;i<nums.length;i++){
        currentArr +=nums[i];
        if(currentArr>maxSum){
            maxSum=currentArr;
        }if(currentArr<0){
            currentArr=0;
        }
    }
        return maxSum;
    }
}