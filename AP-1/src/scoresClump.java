public boolean scoresClump(int[] scores) {
    for (int r = 0; r < scores.length - 2; r++) {
        int first = scores[r];
        int second = scores[r + 1];
        int third = scores[r + 2];
        int max = Math.max(first, Math.max(second, third));
        int min = Math.min(first, Math.min(second, third));
        if (max - min <= 2) {
            return true;
        }
    }
    return false;
}
