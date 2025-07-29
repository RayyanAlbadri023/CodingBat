List<Integer> math1(List<Integer> nums) {
    List<Integer> answer = new ArrayList<>();
    for (int n : nums) {
        answer.add((n + 1) * 10);
    }
    return answer;
}
