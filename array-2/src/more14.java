public boolean more14(int[] nums) {
    int c1 = 0;
    int c4 = 0;
    for (int r = 0; r < nums.length; r++) {
        if (nums[r] == 1) {
            c1++;
        } else if (nums[r] == 4) {
            c4++;
        }
    }
    return c1 > c4;
}
