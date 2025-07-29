public String repeatFront(String str, int n) {
    String answer = "";
    for (int r = n; r > 0; r--) {
        answer = answer + str.substring(0, r);
    }
    return answer;
}
