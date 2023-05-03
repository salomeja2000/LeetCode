class Solution {
    public List<String> letterCombinations(String digits) {
        if (digits.equals("")) {
            return new ArrayList<>();
        }

        List<List<String>> letterList = new ArrayList<>();

        letterList.add(List.of("a", "b", "c"));
        letterList.add(List.of("d", "e", "f"));
        letterList.add(List.of("g", "h", "i"));
        letterList.add(List.of("j", "k", "l"));
        letterList.add(List.of("m", "n", "o"));
        letterList.add(List.of("p", "q", "r", "s"));
        letterList.add(List.of("t", "u", "v"));
        letterList.add(List.of("w", "x", "y", "z"));

        ArrayList<Integer> inputList = new ArrayList<>();

        for (int i = 0; i < digits.length(); i++) {
            String temp = "" + digits.charAt(i);
            inputList.add(Integer.parseInt(temp) - 2);
        }

        ArrayList<String> results = new ArrayList<>();

        for (String firstCharacter : letterList.get(inputList.get(0))) {
            if (inputList.size() > 1) {
                for (String secondCharacter : letterList.get(inputList.get(1))) {
                    if (inputList.size() > 2) {
                        for (String thirdCharacter : letterList.get(inputList.get(2))) {
                            if (inputList.size() > 3) {
                                for (String fourthCharacter : letterList.get(inputList.get(3))) {
                                    results.add(firstCharacter + secondCharacter + thirdCharacter
                                                + fourthCharacter);
                                }
                            } else results.add(firstCharacter + secondCharacter + thirdCharacter);
                        }
                    } else results.add(firstCharacter + secondCharacter);
                }
            } else results.add(firstCharacter);
        }
        return results;

    }
}