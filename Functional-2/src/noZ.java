List<String> noZ(List<String> strings) {
    List<String> answer = new ArrayList<>();
    for (String s : strings) {
        if (!s.contains("z")) {
            answer.add(s);
        }
    }
    return answer;
}
