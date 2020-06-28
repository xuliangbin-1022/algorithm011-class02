class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int l = m + n - 1;

        if (nums1.length < m-- + n--) {
            return;
        }
        
        while (m >= 0 && n >= 0) {
            if (nums2[n] >= nums1[m]) {
                nums1[l--] = nums2[n--];
            } else {
                nums1[l--] = nums1[m--];
            }
        }

        while (n >= 0 && l >= 0) {
            nums1[l--] = nums2[n--];
        }
    }
}