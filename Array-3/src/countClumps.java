public int countClumps(int[] arr) {
    int count = 0;
    int n = arr.length;
    int r = 0;
    while (r < n) {
        int length = 1;
        while (r + length < n && arr[r] == arr[r + length]) {
            length++;
        }
        if (length > 1) {
            count++;
            r += length;
        } else {
            r++;
        }
    }
    return count;
}
