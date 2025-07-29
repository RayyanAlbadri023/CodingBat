public String doubleChar(String str) {
    String result = "";
    for (int r = 0; r < str.length(); r++) {
        char c = str.charAt(r);
        result = result + c + c;
    }
    return result;
}
