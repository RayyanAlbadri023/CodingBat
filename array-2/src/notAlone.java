public int[] notAlone(int[] nums, int val) {
    for (int r = 1; r < nums.length - 1; r++) {
        if (nums[r] == val) {
            if (nums[r - 1] != val && nums[r + 1] != val) {
                if (nums[r - 1] > nums[r + 1]) {
                    nums[r] = nums[r - 1];
                } else {
                    nums[r] = nums[r + 1];
                }
            }
        }
    }
    return nums;
}
