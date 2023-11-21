class Solution {
    int rev(int n) {
    int res = 0;
    for (; n > 0; n /= 10)
        res = res * 10 + n % 10;
    return res;
}    
public int countNicePairs(int[] nums) {
    Map<Integer, Integer> m = new HashMap<>();
    int res = 0;
    for (var n : nums) {
        int comp = n - rev(n), prev = m.getOrDefault(comp, 0);
        res = (res + prev) % 1000000007;
        m.put(comp,  prev + 1);
    }
    return res;
}
}