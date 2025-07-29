List<Integer> two2(List<Integer> nums) {
    List<Integer> answer = new ArrayList<>();
    for (int n : nums) {
        int val = n * 2;
        if (val % 10 != 2) {
            answer.add(val);
        }
    }
    return answer;
}
