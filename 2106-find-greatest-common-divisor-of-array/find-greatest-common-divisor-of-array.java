class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int max = nums[0];
        int min = nums[nums.length-1];
        return gcd(min,max);
    }
    private int gcd(int a, int b) {
		  if (b == 0) return a;
		  return gcd(b, a % b);
    }
}