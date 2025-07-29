Map<String, String> pairs(String[] strings) {
    Map<String, String> result = new HashMap<>();

    for (String word : strings) {
        String first = word.substring(0, 1);
        String last = word.substring(word.length() - 1);
        result.put(first, last);
    }

    return result;
}
