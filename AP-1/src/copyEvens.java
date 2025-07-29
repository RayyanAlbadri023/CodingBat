public int[] copyEvens(int[] nums, int count) {
    int[] result = new int[count];
    int r = 0;
    int a = 0;

    while (a < count) {
        if (nums[r] % 2 == 0) {
            result[a] = nums[r];
            a++;
        }
        r++;
    }

    return result;
}
