public boolean xyzMiddle(String str) {
    int len = str.length();

    for (int r = 0; r <= len - 3; r++) {
        if (str.substring(r, r + 3).equals("xyz")) {
            int left = r;
            int right = len - (r + 3);
            if (Math.abs(left - right) <= 1) {
                return true;
            }
        }
    }

    return false;
}

