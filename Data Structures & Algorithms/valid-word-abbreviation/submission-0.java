class Solution {
    public boolean validWordAbbreviation(String word, String abbr) {

        int i = 0; // pointer for word
        int j = 0; // pointer for abbr

        while (j < abbr.length()) {

            if (Character.isLetter(abbr.charAt(j))) {

                if (i >= word.length() ||
                    word.charAt(i) != abbr.charAt(j)) {
                    return false;
                }

                i++;
                j++;

            } else {

                if (abbr.charAt(j) == '0') {
                    return false;
                }

                int num = 0;

                while (j < abbr.length()
                        && Character.isDigit(abbr.charAt(j))) {

                    num = num * 10 + (abbr.charAt(j) - '0');
                    j++;
                }

                i += num;

                if (i > word.length()) {
                    return false;
                }
            }
        }

        return i == word.length();
    }
}