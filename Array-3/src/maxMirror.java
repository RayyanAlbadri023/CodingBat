public int maxMirror(int[] arr) {
    int maxLen = 0;
    int n = arr.length;

    for (int r = 0; r < n; r++) {
        for (int j = n - 1; j >= 0; j--) {
            int length = 0;
            while (r + length < n && j - length >= 0 && arr[r + length] == arr[j - length]) {
                length++;
            }
            if (length > maxLen) {
                maxLen = length;
            }
        }
    }
    return maxLen;
}

