public int close10(int a, int b) {
    int dA = Math.abs(10 - a);
    int dB = Math.abs(10 - b);

    if (dA < dB) {
        return a;
    } else if (dB < dA) {
        return b;
    } else {
        return 0;
    }
}
