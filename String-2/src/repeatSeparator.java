public String repeatSeparator(String word, String sep, int count) {
    String result = "";
    for (int r = 0; r < count; r++) {
        result = result + word;
        if (r < count - 1) {
            result = result + sep;
        }
    }
    return result;
}
