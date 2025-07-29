public int sum13(int[] nums) {
    int sum = 0;
    for (int r = 0; r < nums.length; r++) {
        if (nums[r] == 13) {
            r++;
        } else {
            sum += nums[r];
        }
    }
    return sum;
}
