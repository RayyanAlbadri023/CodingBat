public String frontTimes(String str, int n) {
    String a;

    if (str.length() >= 3) {
        a = str.substring(0, 3);
    } else {
        a = str;
    }

    String answer = "";

    for (int i = 0; i < n; i++) {
        answer = answer + a;
    }

    return answer;
}

