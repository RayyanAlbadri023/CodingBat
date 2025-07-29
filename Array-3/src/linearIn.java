public boolean linearIn(int[] outer, int[] inner) {
    int r = 0;
    int j = 0;

    while (r < outer.length && j < inner.length) {
        if (outer[r] < inner[j]) {
            r++;
        } else if (outer[r] == inner[j]) {
            r++;
            j++;
        } else {
            return false;
        }
    }

    return j == inner.length;
}
