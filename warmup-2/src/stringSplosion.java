public String stringSplosion(String str) {
    String answer = "";

    for (int i = 0; i < str.length(); i++) {
        answer = answer + str.substring(0, i + 1);
    }

    return answer;
}

