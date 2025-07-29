public int[] seriesUp(int n) {
    int length = n * (n + 1) / 2;
    int[] result = new int[length];
    int index = 0;

    for (int r = 1; r <= n; r++) {
        for (int num = 1; num <= r; num++) {
            result[index] = num;
            index++;
        }
    }
    return result;
}
