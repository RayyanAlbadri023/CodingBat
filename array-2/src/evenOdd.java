public int[] evenOdd(int[] nums) {
    int[] answer = new int[nums.length];
    int evenIndex = 0;
    int oddIndex = nums.length - 1;

    for (int r = 0; r < nums.length; r++) {
        if (nums[r] % 2 == 0) {
            answer[evenIndex] = nums[r];
            evenIndex++;
        } else {
            answer[oddIndex] = nums[r];
            oddIndex--;
        }
    }
    return answer;
}
