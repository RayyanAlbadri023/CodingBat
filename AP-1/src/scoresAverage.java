public int scoresAverage(int[] scores) {
    int mid = scores.length / 2;
    int firstHalfAvg = average(scores, 0, mid - 1);
    int secondHalfAvg = average(scores, mid, scores.length - 1);
    if (firstHalfAvg > secondHalfAvg) {
        return firstHalfAvg;
    } else {
        return secondHalfAvg;
    }
}

public int average(int[] scores, int start, int end) {
    int sum = 0;
    for (int r = start; r <= end; r++) {
        sum += scores[r];
    }
    return sum / (end - start + 1);
}
