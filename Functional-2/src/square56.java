List<Integer> square56(List<Integer> nums) {
    List<Integer> answer = new ArrayList<>();
    for (int n : nums) {
        int val = n * n + 10;
        int lastDigit = val % 10;
        if (lastDigit != 5 && lastDigit != 6) {
            answer.add(val);
        }
    }
    return answer;
}
