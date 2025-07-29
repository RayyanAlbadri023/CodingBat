public boolean sum28(int[] nums) {
    int sum = 0;
    for (int r = 0; r < nums.length; r++) {
        if (nums[r] == 2) {
            sum += 2;
        }
    }
    return sum == 8;
}
