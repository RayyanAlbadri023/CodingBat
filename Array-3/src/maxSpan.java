public int maxSpan(int[] nums) {
    int max = 0;
    for (int r = 0; r < nums.length; r++) {
        for (int j = nums.length - 1; j >= r; j--) {
            if (nums[r] == nums[j]) {
                int span = j - r + 1;
                if (span > max) {
                    max = span;
                }
                break;
            }
        }
    }
    return max;
}
