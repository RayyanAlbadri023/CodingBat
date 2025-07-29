public boolean dividesSelf(int n) {
    int r = n;
    while (r > 0) {
        int digit = r % 10;
        if (digit == 0 || n % digit != 0) {
            return false;
        }
        r = r / 10;
    }
    return true;
}
