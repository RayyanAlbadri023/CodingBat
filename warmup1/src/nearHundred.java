public boolean nearHundred(int n) {
    int d100 = Math.abs(100 - n);
    int d200 = Math.abs(200 - n);

    if (d100 <= 10) {
        return true;
    } else if (d200 <= 10) {
        return true;
    } else {
        return false;
    }
}
