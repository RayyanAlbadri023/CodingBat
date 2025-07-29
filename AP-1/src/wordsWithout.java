public String[] wordsWithout(String[] words, String target) {
    int count = 0;

    for (String word : words) {
        if (!word.equals(target)) {
            count++;
        }
    }

    String[] answer = new String[count];
    int r = 0;

    for (int a = 0; a < words.length; a++) {
        if (!words[a].equals(target)) {
            answer[r] = words[a];
            r++;
        }
    }

    return answer;
}
