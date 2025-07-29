public boolean in3050(int a, int b) {
    boolean in30to40 = (a >= 30 && a <= 40) && (b >= 30 && b <= 40);
    boolean in40to50 = (a >= 40 && a <= 50) && (b >= 40 && b <= 50);

    if (in30to40 || in40to50) {
        return true;
    } else {
        return false;
    }
}
