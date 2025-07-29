Map<String, Integer> wordLen(String[] strings) {
    Map<String, Integer> result = new HashMap<>();

    for (String word : strings) {
        result.put(word, word.length());
    }

    return result;
}
