class Solution {
    public int[][] largestLocal(int[][] grid) {
        int [][] maxLocal = new int [grid.length-2][grid.length-2];
        for(int i=0;i<maxLocal.length;i++){
            for(int j=0;j<maxLocal.length;j++){
                int localmax=0;
                for(int a=i;a<i+3;a++){
                    for(int b=j;b<j+3;b++){
                        localmax=Math.max(localmax,grid[a][b]);
                    }
                }
                maxLocal[i][j]=localmax;
            }
        }
        return maxLocal;
    }
}