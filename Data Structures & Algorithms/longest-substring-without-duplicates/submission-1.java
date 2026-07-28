class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set= new HashSet<>();
        int left=0;
        int maxLen=0;
        int startIndex;

        for(int i=0;i<s.length();i++){

            char currentChar= s.charAt(i);

            while(set.contains(currentChar)){
                set.remove(s.charAt(left));
                left++;
            }

            set.add(currentChar);

            if(i-left+1>maxLen){
                maxLen=i-left+1;
                startIndex=left;
            }
        }

        return maxLen;
    }
}
