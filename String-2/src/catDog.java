public boolean catDog(String str) {
    int catCount = 0;
    int dogCount = 0;

    for (int r = 0; r < str.length() - 2; r++) {
        String sub = str.substring(r, r + 3);
        if (sub.equals("cat")) {
            catCount++;
        }
        if (sub.equals("dog")) {
            dogCount++;
        }
    }

    return catCount == dogCount;
}
