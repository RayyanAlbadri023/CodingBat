boolean squirrelPlay(int temperature, boolean isSummer) {
    int upperLimit = 90;
    if (isSummer) {
        upperLimit = 100;
    }
    if (temperature >= 60 && temperature <= upperLimit) {
        return true;
    }
    return false;
}
