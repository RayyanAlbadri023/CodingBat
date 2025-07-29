List<Integer> rightDigit(List<Integer> nums) {
    List<Integer> answer = new ArrayList<>();
    for (int n : nums) {
        answer.add(n % 10);
    }
    return answer;
}
