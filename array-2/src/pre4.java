public int[] pre4(int[] nums) {
    int count = 0;
    for (int r = 0; r < nums.length; r++) {
        if (nums[r] == 4) {
            break;
        }
        count++;
    }
    int[] answer = new int[count];
    for (int r = 0; r < count; r++) {
        answer[r] = nums[r];
    }
    return answer;
}
