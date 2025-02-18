class Solution {
    public List<Integer> grayCode(int n) {
        List<Integer> cse = new ArrayList<>();
        for (int i = 0; i < Math.pow(2, n); i++) {
            cse.add(i ^ (i >> 1)); 
        }
        return cse;
    }
}
