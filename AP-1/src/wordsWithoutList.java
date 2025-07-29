public List<String> wordsWithoutList(String[] words, int len) {
    List<String> answer = new ArrayList<>();
    for (int r = 0; r < words.length; r++) {
        if (words[r].length() != len) {
            answer.add(words[r]);
        }
    }
    return answer;
}
