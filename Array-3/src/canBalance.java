public boolean canBalance(int[] nums) {
    for (int r = 0; r < nums.length; r++) {
        int left = 0;
        int right = 0;

        for (int i = 0; i < r; i++) {
            left = left + nums[i];
        }

        for (int j = r; j < nums.length; j++) {
            right = right + nums[j];
        }

        if (left == right) {
            return true;
        }
    }

    return false;
}
