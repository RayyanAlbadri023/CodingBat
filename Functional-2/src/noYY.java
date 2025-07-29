List<String> noYY(List<String> strings) {
    List<String> answer = new ArrayList<>();
    for (String s : strings) {
        String temp = s + "y";
        if (!temp.contains("yy")) {
            answer.add(temp);
        }
    }
    return answer;
}
