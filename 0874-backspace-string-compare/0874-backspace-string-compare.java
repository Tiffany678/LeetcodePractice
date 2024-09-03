class Solution {
    public boolean backspaceCompare(String s, String t) {
        if(getStack(s).equals(getStack(t))){
            return true;
        }
        return false;
    }

    public Stack<Character> getStack(String sta){
        Stack<Character> newSta =new Stack<>();

        for (int i=0; i<sta.length(); i++){
            if(sta.charAt(i) =='#'){
                if(!newSta.isEmpty()){
                    newSta.pop();
                }
            }else{
                newSta.push(sta.charAt(i));
            }
        }

        return newSta;
    }
}