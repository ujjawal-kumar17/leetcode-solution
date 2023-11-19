class Solution {
    public int countKDifference(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for (int n : nums) {
            if (map.containsKey(n + k)) {
                count += map.getOrDefault(n + k, 0);
            }
            if (map.containsKey(n - k)) {
                count += map.getOrDefault(n - k, 0);
            }
            map.put(n, 1 + map.getOrDefault(n, 0));
        }

        return count;
    }
}
