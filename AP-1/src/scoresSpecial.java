public int scoresSpecial(int[] a, int[] b) {
    return largestSpecial(a) + largestSpecial(b);
}

public int largestSpecial(int[] scores) {
    int answer = 0;
    for (int r = 0; r < scores.length; r++) {
        if (scores[r] % 10 == 0 && scores[r] > answer) {
            answer = scores[r];
        }
    }
    return answer;
}
