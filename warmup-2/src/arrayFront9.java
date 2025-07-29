public boolean arrayFront9(int[] nums) {
    int a = nums.length;

    if (a > 4) {
        a = 4;
    }

    for (int i = 0; i < a; i++) {
        if (nums[i] == 9) {
            return true;
        }
    }

    return false;
}
