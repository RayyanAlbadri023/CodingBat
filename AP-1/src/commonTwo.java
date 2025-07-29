public int commonTwo(String[] a, String[] b) {
    int r = 0;
    int s = 0;
    int count = 0;
    String lastCounted = "";

    while (r < a.length && s < b.length) {
        int comp = a[r].compareTo(b[s]);
        if (comp == 0) {
            if (!a[r].equals(lastCounted)) {
                count++;
                lastCounted = a[r];
            }
            r++;
            s++;
        } else if (comp < 0) {
            r++;
        } else {
            s++;
        }
    }
    return count;
}
