List<Integer> noTeen(List<Integer> nums) {
    List<Integer> answer = new ArrayList<>();
    for (int n : nums) {
        if (n < 13 || n > 19) {
            answer.add(n);
        }
    }
    return answer;
}
