List<String> moreY(List<String> strings) {
    List<String> answer = new ArrayList<>();
    for (String s : strings) {
        answer.add("y" + s + "y");
    }
    return answer;
}
