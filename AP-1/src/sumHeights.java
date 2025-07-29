public int sumHeights(int[] heights, int start, int end) {
    int answer = 0;
    for (int r = start; r < end; r++) {
        answer += Math.abs(heights[r] - heights[r + 1]);
    }
    return answer;
}
