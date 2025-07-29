public boolean xyBalance(String str) {
    int lX = str.lastIndexOf('x');
    int lY = str.lastIndexOf('y');
    return lX == -1 || lY >= lX;
}
