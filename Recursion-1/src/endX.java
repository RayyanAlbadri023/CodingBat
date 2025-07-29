String endX(String str) {
    if (str.length() == 0) {
        return "";
    }
    char a = str.charAt(0);
    String rest = endX(str.substring(1));
    if (a == 'x') {
        return rest + a;
    } else {
        return a + rest;
    }
}
