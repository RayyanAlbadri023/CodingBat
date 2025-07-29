public int[] makeLast(int[] nums) {
    int[] answer = new int[nums.length * 2];
    answer[answer.length - 1] = nums[nums.length - 1];
    return answer;
}
