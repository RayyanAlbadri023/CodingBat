List<Integer> square(List<Integer> nums) {
    List<Integer> answer = new ArrayList<>();
    for (int n : nums) {
        answer.add(n * n);
    }
    return answer;
}
