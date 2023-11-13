class Solution {
    public  int maxProductDifference(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j <nums.length ; j++) {
                if(nums[i]>nums[j]){
                    int temp = nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;
                }
            }
        }
        return nums[nums.length-1]*nums[nums.length-2]-nums[0]*nums[1];
    }
}