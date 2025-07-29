public int[] withoutTen(int[] nums) {
    int[] answer = new int[nums.length];
    int pos = 0;
    for (int r = 0; r < nums.length; r++) {
        if (nums[r] != 10) {
            answer[pos] = nums[r];
            pos++;
        }
    }
    return answer;
}
