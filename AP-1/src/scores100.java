public boolean scores100(int[] scores) {
    for (int r = 1; r < scores.length; r++) {
        if (scores[r] == 100 && scores[r - 1] == 100) {
            return true;
        }
    }
    return false;
}
