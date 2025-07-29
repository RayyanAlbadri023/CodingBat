Map<String, String> mapAB4(Map<String, String> map) {
    if (map.containsKey("a") && map.containsKey("b")) {
        String a = map.get("a");
        String b = map.get("b");

        if (a.length() == b.length()) {
            map.put("a", "");
            map.put("b", "");
        } else {
            if (a.length() > b.length()) {
                map.put("c", a);
            } else {
                map.put("c", b);
            }
        }
    }
    return map;
}
