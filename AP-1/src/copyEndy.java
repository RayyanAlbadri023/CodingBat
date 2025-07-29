public int[] copyEndy(int[] nums, int count) {
    int[] result = new int[count];
    int r = 0;
    int a = 0;

    while (a < count) {
        if (isEndy(nums[r])) {
            result[a] = nums[r];
            a++;
        }
        r++;
    }

    return result;
}

public boolean isEndy(int n) {
    return (n >= 0 && n <= 10) || (n >= 90 && n <= 100);
}
