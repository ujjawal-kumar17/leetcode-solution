class Solution {
    public int threeSumClosest(int[] nums, int target) {
	var closest = 0;
	var n = nums.length;
	var minDiff = Integer.MAX_VALUE;
	Arrays.sort(nums);

	for (var i = 0; i < n - 2; i++) {
		var k = n - 1;

		for (var j = i + 1; j < k;) {
			var sum = nums[i] + nums[j] + nums[k];

			if (sum == target)
				return target;
			if (sum < target)
				j++;
			else
				k--;

			var diff = Math.abs(target - sum);
			if (diff < minDiff) {
				minDiff = diff;
				closest = sum;
			}
		}
	}
	return closest;
}
}