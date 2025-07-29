String wordAppend(String[] strings) {
    Map<String, Integer> counts = new HashMap<>();
    String answer = "";

    for (String word : strings) {
        int count = counts.getOrDefault(word, 0) + 1;
        counts.put(word, count);
        if (count % 2 == 0) {
            answer += word;
        }
    }

    return answer;
}
