class Solution {
    public int reductionOperations(int[] nums) {
    int count = 0;
    Arrays.sort(nums);
    for (int i = nums.length - 1; i > 0; --i)
        if (nums[i - 1] != nums[i])
            count += nums.length - i;
    return count;
}
}