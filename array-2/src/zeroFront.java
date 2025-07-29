public int[] zeroFront(int[] nums) {
    int[] answer = new int[nums.length];
    int pos = 0;
    for (int r = 0; r < nums.length; r++) {
        if (nums[r] == 0) {
            answer[pos] = 0;
            pos++;
        }
    }
    for (int r = 0; r < nums.length; r++) {
        if (nums[r] != 0) {
            answer[pos] = nums[r];
            pos++;
        }
    }
    return answer;
}
