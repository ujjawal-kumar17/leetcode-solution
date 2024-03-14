class Solution {
    public long countSubarrays(int[] arr, long k) {

        long count = 0;

        long sum = 0;
        int start = 0, end = 0;

        while (end < arr.length) {

            sum += arr[end];
            int length = end - start + 1;
            long score = sum * length;

            while (score >= k && start <= end) {
                sum -= arr[start];
                length -= 1;
                score = sum * length;
                start += 1;
            }

            count += end - start + 1;
            end += 1;
        }

        return count;
    }
}