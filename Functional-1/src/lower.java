List<String> lower(List<String> strings) {
    List<String> answer = new ArrayList<>();
    for (String s : strings) {
        answer.add(s.toLowerCase());
    }
    return answer;
}
