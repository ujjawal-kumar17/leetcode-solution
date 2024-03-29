class Solution {
    public long countSubarrays(int[] nums, int k) {
        int n = nums.length;
        int maxi = Integer.MIN_VALUE;
        for (int num : nums) {
            maxi = Math.max(maxi, num);
        }
        
        int i = 0, j = 0, cnt = 0;
        long ans = 0;

        while (j < n) {
            if (nums[j] == maxi) {
                cnt++;
            }
            if (cnt >= k) {
                while (cnt >= k) {
                    ans += n - j;
                    if (nums[i] == maxi) {
                        cnt--;
                    }
                    i++;
                }
            }
            j++;
        }
        
        return ans;
    }
}

