public String[] fizzBuzz(int start, int end) {
    String[] answer = new String[end - start];
    for (int r = 0; r < answer.length; r++) {
        int num = start + r;
        if (num % 3 == 0 && num % 5 == 0) {
            answer[r] = "FizzBuzz";
        } else if (num % 3 == 0) {
            answer[r] = "Fizz";
        } else if (num % 5 == 0) {
            answer[r] = "Buzz";
        } else {
            answer[r] = String.valueOf(num);
        }
    }
    return answer;
}
