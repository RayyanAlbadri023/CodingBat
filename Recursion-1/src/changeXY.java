String changeXY(String str) {
    if (str.length() == 0) {
        return "";
    }

    char a = str.charAt(0);
    if (a == 'x') {
        a = 'y';
    }

    return a + changeXY(str.substring(1));
}
