public int centeredAverage(int[] nums) {
    int max = nums[0];
    int min = nums[0];
    int sum = 0;
    for (int r = 0; r < nums.length; r++) {
        sum += nums[r];
        max = Math.max(max, nums[r]);
        min = Math.min(min, nums[r]);
    }
    sum = sum - max - min;
    return sum / (nums.length - 2);
}
