public int bigHeights(int[] heights, int start, int end) {
    int answer = 0;
    for (int r = start; r < end; r++) {
        int diff = Math.abs(heights[r + 1] - heights[r]);
        if (diff >= 5) {
            answer++;
        }
    }
    return answer;
}
