class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<operations.length;i++){
          if(operations[i].equals("C")){
            st.pop();
          }
          else if(operations[i].equals("D")){
            int n=2*st.peek();
            st.push(n);
          }
          else if(operations[i].equals("+")){
            if(st.size()>=2){
            int n=st.peek();
            int ps=st.peek();
            st.pop();
            n=n+st.peek();
            st.push(ps);
            st.push(n);
            }
          } else{
            int n=Integer.parseInt(operations[i]);
            st.push(n);
          }
        }
        int sum=0;
        while(!st.isEmpty()){
            sum=sum+ st.pop();
          
        }
        return sum;
    }
}