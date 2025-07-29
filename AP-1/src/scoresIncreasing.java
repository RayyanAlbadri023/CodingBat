public boolean scoresIncreasing(int[] scores) {
    for (int r = 1; r < scores.length; r++) {
        if (scores[r] < scores[r - 1]) {
            return false;
        }
    }
    return true;
}
