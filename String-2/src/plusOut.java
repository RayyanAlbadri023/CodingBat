public String plusOut(String str, String word) {
    String result = "";
    int r = 0;
    int wordLen = word.length();

    while (r < str.length()) {
        if (r <= str.length() - wordLen && str.substring(r, r + wordLen).equals(word)) {
            result += word;
            r += wordLen;
        } else {
            result += "+";
            r++;
        }
    }

    return result;
}
