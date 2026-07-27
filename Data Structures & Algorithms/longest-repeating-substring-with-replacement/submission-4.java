class Solution {
    public int characterReplacement(String s, int k) {
        int left=0;
        int maxLen=0;
        int maxFreq=0;
        int[] count= new int[26];

        for(int i=0;i<s.length();i++){
            char currentChar= s.charAt(i);

            count[currentChar-'A']++;

            maxFreq=Math.max(maxFreq, count[currentChar-'A']);

            while((i-left+1)-maxFreq>k){
                count[s.charAt(left)-'A']--;
                left++;
            }

            maxLen=Math.max(maxLen, i-left+1);


        }

        return maxLen;
    }
}
