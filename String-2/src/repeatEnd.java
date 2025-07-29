public String repeatEnd(String str, int n) {
    String result = "";
    String end = str.substring(str.length() - n);

    for (int r = 0; r < n; r++) {
        result = result + end;
    }

    return result;
}
