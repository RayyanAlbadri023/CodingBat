public boolean prefixAgain(String str, int n) {
    String prefix = str.substring(0, n);

    for (int r = 1; r <= str.length() - n; r++) {
        String part = str.substring(r, r + n);
        if (part.equals(prefix)) {
            return true;
        }
    }

    return false;
}
