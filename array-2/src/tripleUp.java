public boolean tripleUp(int[] r) {
    for (int i = 0; i < r.length - 2; i++) {
        if (r[i + 1] == r[i] + 1 && r[i + 2] == r[i] + 2) {
            return true;
        }
    }
    return false;
}

