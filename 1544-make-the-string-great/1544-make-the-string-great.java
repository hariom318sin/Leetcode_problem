class Solution {
    public String makeGood(String s) {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(st.isEmpty()){
                st.push(ch);
            }
             else if(!st.isEmpty() && Math.abs(ch-st.peek())==32){
                st.pop();
            } else {
                st.push(ch);
            }
        }
        String str="";
        while(!st.isEmpty()){
            str=str+st.pop();
        }
        String str1="";
        for(int i=str.length()-1;i>=0;i--){
            char ch=str.charAt(i);
            str1=str1+ch;
        }
        return str1;
    }
}