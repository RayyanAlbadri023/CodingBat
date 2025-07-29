public int[] fix34(int[] nums) {
    int a = 0;
    for (int r = 0; r < nums.length - 1; r++) {
        if (nums[r] == 3) {
            while (nums[a] != 4 || (a > 0 && nums[a - 1] == 3)) {
                a++;
            }
            int temp = nums[r + 1];
            nums[r + 1] = nums[a];
            nums[a] = temp;
        }
    }
    return nums;
}
