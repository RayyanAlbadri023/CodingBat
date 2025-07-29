String[] firstSwap(String[] strings) {
    Map<String, Integer> map = new HashMap<>();
    Set<String> swapped = new HashSet<>();

    for (int r = 0; r < strings.length; r++) {
        String first = strings[r].substring(0, 1);

        if (swapped.contains(first)) {
            continue;
        }

        if (map.containsKey(first)) {
            int prev = map.get(first);
            String temp = strings[r];
            strings[r] = strings[prev];
            strings[prev] = temp;
            swapped.add(first);
            map.remove(first);
        } else {
            map.put(first, r);
        }
    }

    return strings;
}
