String alarmClock(int r, boolean vacation) {
    boolean weekend = (r == 0 || r == 6);
    if (vacation) {
        if (weekend) {
            return "off";
        } else {
            return "10:00";
        }
    } else {
        if (weekend) {
            return "10:00";
        } else {
            return "7:00";
        }
    }
}
