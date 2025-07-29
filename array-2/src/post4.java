public int[] post4(int[] nums) {
    int lastIndex = 0;
    for (int r = 0; r < nums.length; r++) {
        if (nums[r] == 4) {
            lastIndex = r;
        }
    }
    int length = nums.length - lastIndex - 1;
    int[] answer = new int[length];
    for (int r = 0; r < length; r++) {
        answer[r] = nums[lastIndex + 1 + r];
    }
    return answer;
}
