public int scoreUp(String[] key, String[] answers) {
    int score = 0;

    for (int r = 0; r < key.length; r++) {
        if (answers[r].equals("?")) {
            continue;
        } else if (answers[r].equals(key[r])) {
            score += 4;
        } else {
            score -= 1;
        }
    }

    return score;
}
