public String mixString(String a, String b) {
    String result = "";
    int i = 0;

    while (i < a.length() && i < b.length()) {
        result = result + a.charAt(i) + b.charAt(i);
        i++;
    }

    if (i < a.length()) {
        result = result + a.substring(i);
    }
    if (i < b.length()) {
        result = result + b.substring(i);
    }

    return result;
}
