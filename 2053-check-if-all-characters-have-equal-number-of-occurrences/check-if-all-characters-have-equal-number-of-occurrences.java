class Solution {
    public boolean areOccurrencesEqual(String s) {
        int firstCharCount = s.length() - s.replaceAll(String.valueOf(s.charAt(0)), "").length();

        for (int i = 1; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            if (currentChar != s.charAt(0)) {
                int currentCharCount = s.length() - s.replaceAll(String.valueOf(currentChar), "").length();
                if (currentCharCount != firstCharCount) {
                    return false;
                }
            }
        }
        return true;
    }
}
