class Solution {
    public long countAlternatingSubarrays(int[] nums) {
        long maxi=0;
        int i=0,j=0;
        for(i=0,j=0;i<nums.length-1;i++)
        {
            if(nums[i]==nums[i+1])
            {
                int val = i-j+1;
                maxi+=(long)val*((long)(val+1))/2;
                j=i+1;
            }
        }
        int val = i-j+1;
        maxi+=(long)val*((long)(val+1))/2;
        return maxi;
    }
}