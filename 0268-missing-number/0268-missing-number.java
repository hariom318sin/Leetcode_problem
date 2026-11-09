class Solution {
    public int missingNumber(int[] nums) {
           int sumXor=0;
        for(int i=0;i<nums.length;i++){
            sumXor=sumXor^nums[i];
        }
        
        for(int i=0;i<=nums.length;i++){
            sumXor=sumXor^i;
        }
        return sumXor;
    }
}