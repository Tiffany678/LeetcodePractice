class Solution {
    public boolean isPalindrome(String s) {
        // trasforming the input string into a new string without spaces and other symbols using regex.
        // interate the string and compair chars by two pointers 
        
        String str = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        int j = str.length() - 1;
        for(int i = 0; i < str.length(); ++i) {
            if(str.charAt(i) != str.charAt(j)) {
                return false;
            }
            --j;
        }
        
        return true;
    }
}