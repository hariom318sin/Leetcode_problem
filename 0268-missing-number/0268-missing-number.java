class Solution {
    public int missingNumber(int[] nums) {
     int n=nums.length;
       HashMap<Integer,Integer> m=new HashMap<>();
       for(int i=0;i<n;i++){
        m.put(nums[i],nums[i]);
       }
       int p=0;
       while(n>=0){
        if(m.containsKey(n)){
            n--;
        } else{
              p=n;
              break;
        }
       }
     return p;
    }
}