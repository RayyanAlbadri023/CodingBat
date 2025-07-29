int countX(String str) {
    if (str.length() == 0) {
        return 0;
    }

    int countForFirst = (str.charAt(0) == 'x') ? 1 : 0;
    return countForFirst + countX(str.substring(1));
}
