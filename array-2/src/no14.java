public boolean no14(int[] nums) {
    boolean has1 = false;
    boolean has4 = false;
    for (int r = 0; r < nums.length; r++) {
        if (nums[r] == 1) has1 = true;
        if (nums[r] == 4) has4 = true;
    }
    return !has1 || !has4;
}
