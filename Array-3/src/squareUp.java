public int[] squareUp(int n) {
    int[] result = new int[n * n];
    for (int r = 1; r <= n; r++) {
        for (int j = 0; j < r; j++) {
            result[r * n - j - 1] = j + 1;
        }
    }
    return result;
}
