class Solution {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        int temp[] = new int[k];
        int t = 0;
        for (int i = nums.length - k; i < nums.length; i++) {
            temp[t] = nums[i];
            t++;
        }
        for (int i = nums.length - 1; i >= k; i--) {
            nums[i] = nums[i - k];
        }
        for (int i = 0; i < temp.length; i++) {
            nums[i] = temp[i];
        }

    }
}