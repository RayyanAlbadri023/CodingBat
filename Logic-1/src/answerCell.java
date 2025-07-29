boolean answerCell(boolean morning, boolean mom, boolean asleep) {
    if (asleep) {
        return false;
    } else {
        if (morning) {
            if (mom) {
                return true;
            } else {
                return false;
            }
        } else {
            return true;
        }
    }
}
