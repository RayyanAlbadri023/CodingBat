List<Integer> noNeg(List<Integer> nums) {
    List<Integer> answer = new ArrayList<>();
    for (int n : nums) {
        if (n >= 0) {
            answer.add(n);
        }
    }
    return answer;
}
