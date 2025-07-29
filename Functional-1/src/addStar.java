List<String> addStar(List<String> strings) {
    List<String> answer = new ArrayList<>();
    for (String s : strings) {
        answer.add(s + "*");
    }
    return answer;
}
