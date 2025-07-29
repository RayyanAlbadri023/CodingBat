public String stringBits(String str) {
    String answer = "";

    for (int i = 0; i < str.length(); i += 2) {
        answer = answer + str.charAt(i);
    }

    return answer;
}
