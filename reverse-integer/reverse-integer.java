class Solution {
    public int reverse(int x) {
        long xLong = x;
        StringBuilder num = new StringBuilder();

        if (x < 0) {
            num.append(xLong * -1);
        } else {
            num.append(xLong);
        }

        xLong = Long.valueOf(String.valueOf(num.reverse()));

        if (x < 0) {
            xLong *= -1;
        }

        if (xLong > 2147483647 || xLong < -2147483648) {
            return 0;
        }
        return (int) xLong;
    }
}