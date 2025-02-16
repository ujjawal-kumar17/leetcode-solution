class Solution {
    public double separateSquares(int[][] squares) {
        int n = squares.length;
        
        double totalArea = 0.0;
        double lo = Double.MAX_VALUE;
        double hi = -Double.MAX_VALUE;
        
        for (int[] s : squares) {
            int y = s[1], l = s[2];
            totalArea += (double) l * l;
            lo = Math.min(lo, y);
            hi = Math.max(hi, y + l);
        }
        
        double target = totalArea / 2.0;

        for (int iter = 0; iter < 100; iter++) {
            double mid = (lo + hi) / 2.0;
            double areaBelow = 0.0;
            for (int[] s : squares) {
                double y = s[1];
                double l = s[2];
                double top = y + l;
                if (mid <= y) {

                    areaBelow += 0;
                } else if (mid >= top) {
  
                    areaBelow += l * l;
                } else {

                    areaBelow += (mid - y) * l;
                }
            }
            if (areaBelow < target) {
                lo = mid;
            } else {
                hi = mid;
            }
        }
        return hi;
    }
}
