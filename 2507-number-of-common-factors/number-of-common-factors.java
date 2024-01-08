class Solution {
    public int commonFactors(int a, int b) {
        int count = 0, n = 0;
        while(n++ <= Math.min(a,b)){
            if(a % n == 0 && b % n == 0)    count++;
        }
        return count;
    }
}