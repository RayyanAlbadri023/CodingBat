Map<String, Boolean> wordMultiple(String[] strings) {
    Map<String, Integer> c = new HashMap<>();
    Map<String, Boolean> answer = new HashMap<>();

    for (String word : strings) {
        int count = c.getOrDefault(word, 0) + 1;
        c.put(word, count);
    }

    for (String word : c.keySet()) {
        answer.put(word, c.get(word) >= 2);
    }

    return answer;
}
