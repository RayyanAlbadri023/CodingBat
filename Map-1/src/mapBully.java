Map<String, String> mapBully(Map<String, String> map) {
    if (map.containsKey("a")) {
        String val = map.get("a");
        map.put("b", val);
        map.put("a", "");
    }
    return map;
}
