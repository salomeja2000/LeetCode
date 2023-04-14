class Solution {
    public int firstUniqChar(String s) {
    String usedCharacters = "";
        for (int i = 0; i < s.length() - 1; i++) {
            boolean found = false;
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    usedCharacters += s.charAt(i);
                    found = true;
                    break;
                }
            }
            if (!found) {
                for (int j = 0; j < usedCharacters.length(); j++) {
                    if (s.charAt(i) == usedCharacters.charAt(j)) {
                        found = true;
                        break;
                    }
                }
            }
            for (int j = 0; j < usedCharacters.length(); j++) {
                if (s.charAt(i) == usedCharacters.charAt(j)) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                return i;
            }
        }
        boolean found = false;
        for (int j = 0; j < usedCharacters.length(); j++) {
            if (s.charAt(s.length() - 1) == usedCharacters.charAt(j)) {
                found = true;
                break;
            }
        }
        if (!found) {
            return s.length() - 1;
        }
        return -1;    
    }
}