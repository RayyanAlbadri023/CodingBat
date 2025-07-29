public int wordsCount(String[] words, int len) {
    int c = 0;
    for (int r = 0; r < words.length; r++) {
        if (words[r].length() == len) {
            c++;
        }
    }
    return c;
}
