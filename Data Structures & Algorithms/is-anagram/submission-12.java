class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length()!=t.length()){
            return false;
        }

        Map<Character, Integer> map= new HashMap<>();
        char[] sChar= s.toCharArray();
        char[] tChar= t.toCharArray();

        for(char c: sChar){
            
            map.put(c, map.getOrDefault(c,0)+1);
        }

        for(char tCurr: tChar){
            if(!map.containsKey(tCurr)){
                return false;
            }

            map.put(tCurr, map.get(tCurr)-1);

            if(map.get(tCurr)==0){
                map.remove(tCurr);
            }
        }

        if(!map.isEmpty()){
            return false;
        } else{
            return true;
        }

        
    }
}
