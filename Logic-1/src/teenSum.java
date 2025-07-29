boolean isTeen(int r) {
    return (r >= 13 && r <= 19);
}

int teenSum(int a, int b) {
    if (isTeen(a) || isTeen(b)) {
        return 19;
    }
    return a + b;
}
