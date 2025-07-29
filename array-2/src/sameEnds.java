public boolean sameEnds(int[] r, int n) {
    for (int i = 0; i < n; i++) {
        if (r[i] != r[r.length - n + i]) {
            return false;
        }
    }
    return true;
}
