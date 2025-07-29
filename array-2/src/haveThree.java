public boolean haveThree(int[] r) {
    int count = 0;
    for (int i = 0; i < r.length; i++) {
        if (r[i] == 3) {
            count++;
            if (i > 0 && r[i - 1] == 3) {
                return false;
            }
        }
    }
    return count == 3;
}
