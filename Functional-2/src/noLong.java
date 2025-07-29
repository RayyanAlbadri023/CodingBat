List<String> noLong(List<String> strings) {
    List<String> answer = new ArrayList<>();
    for (String s : strings) {
        if (s.length() < 4) {
            answer.add(s);
        }
    }
    return answer;
}
