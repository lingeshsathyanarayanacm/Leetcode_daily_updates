import java.util.*;

class Solution {
    public boolean check(int[] nums) {
        int n = nums.length;
        int[] arr = Arrays.copyOf(nums, n); 
        Arrays.sort(arr); 
        
        List<List<Integer>> cse = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            List<Integer> current = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                current.add(nums[(j + i) % n]);
            }
            cse.add(new ArrayList<>(current));
        }
        
        return cse.contains(Arrays.asList(Arrays.stream(arr).boxed().toArray(Integer[]::new)));
    }
}
