public boolean hasOne(int n) {
    while (n > 0) {
        int r = n % 10;
        if (r == 1) {
            return true;
        }
        n = n / 10;
    }
    return false;
}
