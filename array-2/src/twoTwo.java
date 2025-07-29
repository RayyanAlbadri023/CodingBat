public boolean twoTwo(int[] r) {
    for (int i = 0; i < r.length; i++) {
        if (r[i] == 2) {
            if ((i > 0 && r[i - 1] == 2) || (i < r.length - 1 && r[i + 1] == 2)) {
                continue;
            } else {
                return false;
            }
        }
    }
    return true;
}
