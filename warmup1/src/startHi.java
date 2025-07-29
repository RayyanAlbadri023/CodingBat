public boolean startHi(String str) {
    if (str.length() >= 2) {
        String firstTwo = str.substring(0, 2);
        if (firstTwo.equals("hi")) {
            return true;
        }
    }
    return false;
}
