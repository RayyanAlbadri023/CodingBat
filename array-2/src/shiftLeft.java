public int[] shiftLeft(int[] nums) {
    if (nums.length <= 1) return nums;
    int first = nums[0];
    for (int r = 0; r < nums.length - 1; r++) {
        nums[r] = nums[r + 1];
    }
    nums[nums.length - 1] = first;
    return nums;
}
