public String starOut(String str) {
    String result = "";
    int length = str.length();

    for (int r = 0; r < length; r++) {
        boolean leftStar = (r > 0 && str.charAt(r - 1) == '*');
        boolean rightStar = (r < length - 1 && str.charAt(r + 1) == '*');
        boolean isStar = (str.charAt(r) == '*');

        if (!isStar && !leftStar && !rightStar) {
            result += str.charAt(r);
        }
    }

    return result;
}
