import java.util.*;

class Solution {
    public boolean check(int[] nums) {
        int n = nums.length;
        List<Integer> sortedList = new ArrayList<>();
        for (int num : nums) {
            sortedList.add(num);
        }
        Collections.sort(sortedList);
        
        List<List<Integer>> cse = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            List<Integer> current = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                current.add(nums[(j + i) % n]);
            }
            cse.add(current);
        }
        
        return cse.contains(sortedList);
    }
}
