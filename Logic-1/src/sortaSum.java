int sortaSum(int a, int b) {
    int r = a + b;
    if (r >= 10 && r <= 19) {
        return 20;
    }
    return r;
}
