class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int [] merged = new int[nums1.length+nums2.length];
        int k = 0;
        for(int i =0;i<nums1.length;i++){
            merged[k++]=nums1[i];
        }
        for (int i=0;i<nums2.length;i++){
            merged[k++]=nums2[i];
        }
        Arrays.sort(merged);
        int total = merged.length;

        if (total % 2 == 1) {
            return (double) merged[total / 2];
        } else {
            int middle1 = merged[total / 2 - 1];
            int middle2 = merged[total / 2];
            return ((double) middle1 + (double) middle2) / 2.0;
        }
        
    }
}