class Solution {
    public String removeDuplicates(String s) {
      Stack<Character> st=new Stack<>();
      String str="";
      for(int i=0;i<s.length();i++){
        char ch=s.charAt(i);
      if(!st.isEmpty() && ch==st.peek()){
            st.pop();
        } else {
            st.push(ch);
        }
      }  
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