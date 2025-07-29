public int[] zeroMax(int[] nums) {
    for (int r = 0; r < nums.length; r++) {
        if (nums[r] == 0) {
            int maxOdd = 0;
            for (int i = r + 1; i < nums.length; i++) {
                if (nums[i] % 2 == 1 && nums[i] > maxOdd) {
                    maxOdd = nums[i];
                }
            }
            if (maxOdd > 0) {
                nums[r] = maxOdd;
            }
        }
    }
    return nums;
}
