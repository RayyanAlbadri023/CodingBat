public boolean modThree(int[] r) {
    for (int i = 0; i < r.length - 2; i++) {
        if (r[i] % 2 == r[i + 1] % 2 && r[i] % 2 == r[i + 2] % 2) {
            return true;
        }
    }
    return false;
}
