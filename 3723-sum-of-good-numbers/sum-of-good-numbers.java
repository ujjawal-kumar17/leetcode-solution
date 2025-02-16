class Solution {
    public int sumOfGoodNumbers(int[] nums, int k) {
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            boolean isGood = true;
            int left = i - k;
            if (left >= 0) {
                if (nums[i] <= nums[left]) {
                    isGood = false;
                }
            }
            int right = i + k;
            if (right < nums.length) {
                if (nums[i] <= nums[right]) {
                    isGood = false;
                }
            }
            if (isGood) {
                ans += nums[i];
            }
        }
        return ans;
    }
}
