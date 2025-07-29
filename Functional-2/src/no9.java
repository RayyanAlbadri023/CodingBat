List<Integer> no9(List<Integer> nums) {
    List<Integer> answer = new ArrayList<>();
    for (int n : nums) {
        if (n % 10 != 9) {
            answer.add(n);
        }
    }
    return answer;
}
