class Solution {
    public String removeStars(String s) {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='*' && !st.isEmpty()){
                st.pop();
            } else {
                st.push(ch);
            }
        }
        String str="";
        String str1="";
        while(!st.isEmpty()){
            str=str+st.pop();
        }
        for(int i=str.length()-1;i>=0;i--){
            char ch=str.charAt(i);
            str1=str1+ch;
        }
        return str1;
    }
}