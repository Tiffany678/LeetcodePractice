class Solution {

    // Create an method to get the result for each string after string processing
        //using Stack for pop the element, when chatAt(i) is '#'  
    // compair two strings, if they are the same, return true, otherwise, return false
    public boolean backspaceCompare(String s, String t) {
        if(getString(s).equals(getString(t))){
            return true;
        }
        return false;
    }

    private Stack<Character> getString(String str){
        if(str == null && str.isEmpty()) return null;

        Stack<Character> strStack = new Stack<>();

        for(int i=0; i<str.length(); i++){
          
            if(str.charAt(i) =='#'){
                if(!strStack.isEmpty()){
                    strStack.pop();
                }
            }else{
                 strStack.push(str.charAt(i));
            }
        }
        return strStack;
    }
}