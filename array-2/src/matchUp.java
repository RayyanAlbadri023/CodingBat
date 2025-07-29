public int matchUp(int[] nums1, int[] nums2) {
    int count = 0;
    for (int r = 0; r < nums1.length; r++) {
        int diff = Math.abs(nums1[r] - nums2[r]);
        if (diff <= 2 && diff != 0) {
            count++;
        }
    }
    return count;
}
