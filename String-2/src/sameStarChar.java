public boolean sameStarChar(String str) {
    for (int r = 1; r < str.length() - 1; r++) {
        if (str.charAt(r) == '*') {
            if (str.charAt(r - 1) != str.charAt(r + 1)) {
                return false;
            }
        }
    }
    return true;
}
