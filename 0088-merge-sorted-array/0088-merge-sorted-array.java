class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int mP = 0; // m pointer in array
        int nP = 0; // n pointer in array
        
        int[] nums3 = new int[m];
        System.arraycopy(nums1, 0, nums3, 0, m);

        for (int i = 0; i < nums1.length; i++) {
            if (mP >= m) {
                nums1[i] = nums2[nP];
                nP++;
            } else if (nP >= n) {
                nums1[i] = nums3[mP];
                mP++;
            } else if (nums2[nP] <= nums3[mP]) {
                nums1[i] = nums2[nP];
                nP++;
            } else {
                nums1[i] = nums3[mP];
                mP++;
            }
        }
    }
}