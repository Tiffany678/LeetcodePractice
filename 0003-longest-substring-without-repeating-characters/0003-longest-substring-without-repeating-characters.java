class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxLength = 0;
        Set<Character> charSet = new HashSet<>();
        int left =0;

        for(int right =0; right< n; right++){
            if(!charSet.contains(s.charAt(right))){
                charSet.add(s.charAt(right));
                // keep track of the length of the longest substring between left and right pointers.
                maxLength = Math.max(maxLength, right-left+1);
            }else{
                while(charSet.contains(s.charAt(right))){
                    // update the HashSet by removing the exiting key-value pair
                    charSet.remove(s.charAt(left));
                    left++;
                }
                charSet.add(s.charAt(right));
            }
        }
        return maxLength;
    }
}