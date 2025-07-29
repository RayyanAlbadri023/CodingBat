public int sumHeights2(int[] heights, int start, int end) {
    int answer = 0;
    for (int r = start; r < end; r++) {
        int diff = heights[r + 1] - heights[r];
        if (diff > 0) {
            answer += diff * 2;
        } else {
            answer += Math.abs(diff);
        }
    }
    return answer;
}
