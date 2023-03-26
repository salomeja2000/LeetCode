class Solution {
    public int[] plusOne(int[] digits) {
        if (consistsOfNinesOnly(digits)) {
            int[] answer = new int[digits.length + 1];
            answer[0] = 1;
            for (int i = 1; i < answer.length; i++) {
                answer[i] = 0;
            }
            return answer;
        }
        return addOne(digits, digits.length - 1);
    }

    private int[] addOne(int[] input, int index) {
        if (input[index] == 9) {
            input[index] = 0;
            return addOne(input, index - 1);
        } else {
            input[index]++;
            return input;
        }
    }
    private boolean consistsOfNinesOnly(int[] input) {
        for (int i = 0; i < input.length; i++) {
            if (input[i] != 9) {
                return false;
            }
        }
        return true;
    }
}