import java.util.*;

class Solution {
    public boolean areOccurrencesEqual(String s) {
        char ch[] = s.toCharArray();
        List<Integer> freqList = new ArrayList<>();
        List<Character> checkedChars = new ArrayList<>();

        for (char c : ch) {
            if (!checkedChars.contains(c)) {
                int count = 0;
                for (char x : ch) {
                    if (c == x) count++;
                }
                freqList.add(count);
                checkedChars.add(c);
            }
        }

        for (int i = 1; i < freqList.size(); i++) {
            if (!freqList.get(i).equals(freqList.get(0))) {
                return false;
            }
        }

        return true;
    }
}
