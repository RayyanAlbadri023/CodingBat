Map<String, Integer> wordCount(String[] strings) {
    Map<String, Integer> result = new HashMap<>();

    for (String word : strings) {
        if (result.containsKey(word)) {
            result.put(word, result.get(word) + 1);
        } else {
            result.put(word, 1);
        }
    }

    return result;
}
