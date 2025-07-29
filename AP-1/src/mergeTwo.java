public String[] mergeTwo(String[] a, String[] b, int n) {
    String[] answer = new String[n];
    int r = 0;
    int s = 0;
    int index = 0;

    while (index < n) {
        if (a[r].compareTo(b[s]) < 0) {
            answer[index] = a[r];
            r++;
        } else if (a[r].compareTo(b[s]) > 0) {
            answer[index] = b[s];
            s++;
        } else {
            answer[index] = a[r];
            r++;
            s++;
        }
        index++;
    }

    return answer;
}
