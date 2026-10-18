class Solution {
    public int pivotIndex(int[] nums) {
        int left=0;
        int right=0;
        for(int i=0;i<nums.length;i++){
            
            for(int j=i-1;j>=0;j--){
             left=left+nums[j];
            }
            for(int j=i+1;j<nums.length;j++){
                right=right+nums[j];
            }
            if(left==right){
                return i;
            } else{
            left=0;
            right=0;
            }
        }
        return -1;
    }
}