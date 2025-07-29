public boolean xyzThere(String str) {
    if (str.startsWith("xyz")) {
        return true;
    }
    for (int r = 1; r < str.length() - 2; r++) {
        if (str.substring(r, r + 3).equals("xyz") && str.charAt(r - 1) != '.') {
            return true;
        }
    }
    return false;
}
