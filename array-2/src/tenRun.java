public int[] tenRun(int[] nums) {
    int answer = 0;
    for (int r = 0; r < nums.length; r++) {
        if (nums[r] % 10 == 0) {
            answer = nums[r];
        } else if (answer != 0) {
            nums[r] = answer;
        }
    }
    return nums;
}
