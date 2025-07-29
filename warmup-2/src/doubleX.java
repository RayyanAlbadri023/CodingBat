public boolean doubleX(String str) {
    int i = str.indexOf("x");
    if (i == -1) {
        return false;
    }
    if (i + 1 >= str.length()) {
        return false;
    }
    if (str.charAt(i + 1) == 'x') {
        return true;
    }
    return false;
}
