public String altPairs(String str) {
    String answer = "";

    for (int i = 0; i < str.length(); i += 4) {
        answer = answer + str.charAt(i);
        if (i + 1 < str.length()) {
            answer = answer + str.charAt(i + 1);
        }
    }

    return answer;
}
