List<String> copies3(List<String> strings) {
    List<String> answer = new ArrayList<>();
    for (String s : strings) {
        answer.add(s + s + s);
    }
    return answer;
}
