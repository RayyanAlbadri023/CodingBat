public boolean has12(int[] r) {
    boolean found1 = false;
    for (int i = 0; i < r.length; i++) {
        if (r[i] == 1) {
            found1 = true;
        }
        if (found1 && r[i] == 2) {
            return true;
        }
    }
    return false;
}
