public int userCompare(String aName, int aId, String bName, int bId) {
    int cmp = aName.compareTo(bName);
    if (cmp < 0) {
        return -1;
    } else if (cmp > 0) {
        return 1;
    } else {
        if (aId < bId) {
            return -1;
        } else if (aId > bId) {
            return 1;
        } else {
            return 0;
        }
    }
}
