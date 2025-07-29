boolean old35(int n) {
    boolean r3 = (n % 3 == 0);
    boolean r5 = (n % 5 == 0);
    return (r3 ^ r5);
}
