import java.util.Arrays;

class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g); // Sort children's greed factor
        Arrays.sort(s); // Sort cookie sizes

        int i = 0, j = 0, count = 0;

        while (i < g.length && j < s.length) {
            if (g[i]<=s[j]) { // If the cookie can satisfy the child
                count++;
                i++; // Move to the next child
            }
            j++; // Always move to the next cookie
        }

        return count;
    }
}
