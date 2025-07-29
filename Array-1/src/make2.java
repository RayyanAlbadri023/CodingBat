public int[] make2(int[] a, int[] b) {
    int[] result = new int[2];
    int index = 0;

    if (a.length > 0) {
        result[index] = a[0];
        index++;
    }
    if (a.length > 1) {
        result[index] = a[1];
        index++;
    }
    if (index < 2 && b.length > 0) {
        result[index] = b[0];
        index++;
    }
    if (index < 2 && b.length > 1) {
        result[index] = b[1];
    }

    return result;
}
