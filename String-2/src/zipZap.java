public String zipZap(String str) {
    String result = "";

    for (int r = 0; r < str.length(); r++) {
        if (r > 0 && r < str.length() - 1 &&
                str.charAt(r - 1) == 'z' && str.charAt(r + 1) == 'p') {
        } else {
            result += str.charAt(r);
        }
    }

    return result;
}
