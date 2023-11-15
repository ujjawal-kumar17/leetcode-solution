class Solution {
   public int[] kWeakestRows(int[][] mat, int k) {
    int rows = mat.length;
    int cols = mat[0].length;

    int[] score = new int[rows];
    for (int i = 0; i < rows; i++) {
        int ones=0;
        for (int j=0; j < cols; j++) {
            if (mat[i][j] == 0) {
                break;
            }
        ones++;
        }
        score[i] = ones* rows + i;
    }
 Arrays.sort(score);
    for (int i = 0; i < score.length; i++) {
        score[i] = score[i] % rows;
    }
       int[] ans = new int[k];
   for(int i=0;i<k;i++)
   {
       ans[i]=score[i];
       
   }
return ans;
   }
}