List<Integer> doubling(List<Integer> nums) {
    List<Integer> answer = new ArrayList<>();
    for (int n : nums) {
        answer.add(n * 2);
    }
    return answer;
}
