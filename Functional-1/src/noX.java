List<String> noX(List<String> strings) {
    List<String> answer = new ArrayList<>();
    for (String s : strings) {
        answer.add(s.replace("x", ""));
    }
    return answer;
}
