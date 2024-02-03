class Solution {
    public int search(int[] nums, int target) {
        int ans = bs(nums, 0, nums.length - 1, target);
        return ans;
    }

    private int bs(int[] nums, int start, int end, int target) {
        if (start > end)
            return -1;
        int mid = (start) + (end - start) / 2;
        if (target == nums[mid])
            return mid;
        else if (target > nums[mid])
            return bs(nums, mid + 1, end, target);
        else
            return bs(nums, start, mid - 1, target);
    }
}