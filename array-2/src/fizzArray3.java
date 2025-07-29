public int[] fizzArray3(int start, int end) {
    int[] answer = new int[end - start];
    for (int r = 0; r < answer.length; r++) {
        answer[r] = start + r;
    }
    return answer;
}
