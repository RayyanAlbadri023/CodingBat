public int sum67(int[] nums) {
    int sum = 0;
    boolean ignore = false;
    for (int r = 0; r < nums.length; r++) {
        if (nums[r] == 6) {
            ignore = true;
        } else if (ignore && nums[r] == 7) {
            ignore = false;
        } else if (!ignore) {
            sum += nums[r];
        }
    }
    return sum;
}
