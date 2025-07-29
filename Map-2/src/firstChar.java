Map<String, String> firstChar(String[] strings) {
    Map<String, String> answer = new HashMap<>();

    for (String word : strings) {
        String first = word.substring(0, 1);
        if (answer.containsKey(first)) {
            answer.put(first, answer.get(first) + word);
        } else {
            answer.put(first, word);
        }
    }

    return answer;
}
