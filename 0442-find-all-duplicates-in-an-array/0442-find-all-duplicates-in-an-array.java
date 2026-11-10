class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> st=new ArrayList<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                st.add(nums[i]);
            }
            else{
                map.put(nums[i],i);
            }
        }
        return st;
    }
}