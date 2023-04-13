class Solution {
    public boolean isPalindrome(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (!Character.isAlphabetic(s.charAt(i)) && !Character.isDigit(s.charAt(i))) {
                s = s.replace(String.valueOf(s.charAt(i)), "");
                i--;
            } else if (Character.isUpperCase(s.charAt(i))) {
                s = s.replace(String.valueOf(s.charAt(i)), String.valueOf(s.charAt(i)).toLowerCase());
            }
        }
        if (s.length() <= 1) {
            return true;
        }
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}