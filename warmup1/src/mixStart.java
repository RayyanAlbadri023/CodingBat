public boolean mixStart(String str) {
    if (str.length() >= 3) {
        String lastTwo = str.substring(1, 3);
        if (lastTwo.equals("ix")) {
            return true;
        }
    }
    return false;
}
