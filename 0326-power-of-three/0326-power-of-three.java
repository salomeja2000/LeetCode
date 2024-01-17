class Solution {
    public boolean isPowerOfThree(int n) {
        if (n < 0) {
            return false;
        } else {
            int temp = n;
            while (temp >= 3) {
                if (temp % 3 == 0) {
                    temp = temp / 3;
                } else {
                    return false;
                }
            }
            return temp == 1;
        }
    }
}