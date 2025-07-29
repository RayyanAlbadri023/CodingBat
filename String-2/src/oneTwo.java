public String oneTwo(String str) {
    String result = "";

    for (int r = 0; r + 2 < str.length(); r += 3) {
        char first = str.charAt(r);
        char second = str.charAt(r + 1);
        char third = str.charAt(r + 2);

        result += "" + second + third + first;
    }

    return result;
}
