class Solution {
    public int removeDuplicates(int[] nums) {
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<nums.length;i++){
           
             if(st.isEmpty() || st.peek()!=nums[i]){
                st.push(nums[i]);
            }
            
        }
        int k=st.size();
        for(int i=k-1 ;i>=0;i--){
            nums[i]=st.get(i);
        }
        return k;
    }
}