class Solution {
    public int[] searchRange(int[] nums, int target) {
        int low=0;
        int high=nums.length-1;
        int lb=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(target==nums[mid]){
               lb=mid;
               high=mid-1;
            }
             else if(target<nums[mid]){
                high=mid-1;
             } else{
                low=mid+1;
             }
        }
         low=0;
         high=nums.length-1;
        int ub=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(target==nums[mid]){
               ub=mid;
               low=mid+1;
            }
             else if(target<nums[mid]){
                high=mid-1;
             } else{
                low=mid+1;
             }
        }
        return new int[]{lb,ub};
    }
}