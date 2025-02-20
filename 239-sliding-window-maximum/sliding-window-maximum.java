class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        if (n == 0) return new int[0];

        int[] leftMax = new int[n];  // max from the left within each block
        int[] rightMax = new int[n]; // max from the right within each block
        int[] result = new int[n - k + 1];

        // Compute leftMax and rightMax
        for (int i = 0; i < n; i++) {
            if (i % k == 0) leftMax[i] = nums[i]; // Start of a block
            else leftMax[i] = Math.max(leftMax[i - 1], nums[i]);

            int j = n - 1 - i; // Reverse index
            if ((j + 1) % k == 0 || j == n - 1) rightMax[j] = nums[j]; // End of a block
            else rightMax[j] = Math.max(rightMax[j + 1], nums[j]);
        }

        // Compute result using leftMax and rightMax
        for (int i = 0; i <= n - k; i++) {
            result[i] = Math.max(rightMax[i], leftMax[i + k - 1]);
        }

        return result;
    }
}