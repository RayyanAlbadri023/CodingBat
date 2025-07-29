String noX(String str) {
    if (str.length() == 0) {
        return "";
    }

    char a = str.charAt(0);
    if (a == 'x') {
        return noX(str.substring(1));
    } else {
        return a + noX(str.substring(1));
    }
}
