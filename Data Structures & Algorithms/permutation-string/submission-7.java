class Solution {
    public boolean checkInclusion(String s1, String s2) {
      
        if(s1.length()>s2.length()){
            return false;
        }

        int[] count= new int[26];
        int[] count2= new int[26];
    
        
        for(char c:s1.toCharArray()){

            count[c-'a']++;

        }

        for(int i=0;i<s2.length();i++){
           
            count2[s2.charAt(i)-'a']++;

            if(i>=s1.length()){
                count2[s2.charAt(i-s1.length())-'a']--;
            }
            if(isMatch(count, count2)){
                return true;
            }
        }

            
            

            return false;
    }

    public boolean isMatch(int[] s1, int[] s2) {
    
    for(int i=0;i<26;i++){
        if(s1[i]!=s2[i]){
            return false;
        }         
    }

    return true;

    }
    
}

