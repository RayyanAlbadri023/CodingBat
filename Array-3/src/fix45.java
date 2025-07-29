public int[] fix45(int[] nums) {
    int a = 0;
    for (int r = 0; r < nums.length - 1; r++) {
        if (nums[r] == 4 && nums[r + 1] != 5) {
            while (nums[a] != 5 || (a > 0 && nums[a - 1] == 4)) {
                a++;
            }
            int temp = nums[r + 1];
            nums[r + 1] = nums[a];
            nums[a] = temp;
        }
    }
    return nums;
}
