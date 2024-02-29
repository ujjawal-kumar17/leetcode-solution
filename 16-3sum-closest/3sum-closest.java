class Solution {
    public int threeSumClosest(int[] nums, int target) {
	int closest = 0;
	int n = nums.length;
	int minDiff = Integer.MAX_VALUE;
	Arrays.sort(nums);

	for (int i = 0; i < n - 2; i++) {
		int k = n - 1;

		for (int j = i + 1; j < k;) {
			int sum = nums[i] + nums[j] + nums[k];

			if (sum == target)
				return target;
			if (sum < target)
				j++;
			else
				k--;

			int diff = Math.abs(target - sum);
			if (diff < minDiff) {
				minDiff = diff;
				closest = sum;
			}
		}
	}
	return closest;
}
}