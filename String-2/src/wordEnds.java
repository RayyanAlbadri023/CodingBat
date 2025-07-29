public String wordEnds(String str, String word) {
    String result = "";
    int wordLen = word.length();
    int r = 0;

    while (r <= str.length() - wordLen) {
        if (str.substring(r, r + wordLen).equals(word)) {
            if (r > 0) {
                result += str.charAt(r - 1);
            }
            if (r + wordLen < str.length()) {
                result += str.charAt(r + wordLen);
            }
        }
        r++;
    }

    return result;
}
 