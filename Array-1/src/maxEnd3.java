public int[] maxEnd3(int[] nums) {
    int bigger;
    if (nums[0] > nums[2]) {
        bigger = nums[0];
    } else {
        bigger = nums[2];
    }
    nums[0] = bigger;
    nums[1] = bigger;
    nums[2] = bigger;
    return nums;
}
