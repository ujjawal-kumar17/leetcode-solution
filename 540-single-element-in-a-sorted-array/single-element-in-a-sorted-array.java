class Solution {
    public int singleNonDuplicate(int[] array) {
        int res=array[0];
        for (int i = 1; i < array.length; i++) {
            res = res ^ array[i];
        }
        return res;
    }
}