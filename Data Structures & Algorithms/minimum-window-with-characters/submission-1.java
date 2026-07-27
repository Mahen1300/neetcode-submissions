class Solution {
    public String minWindow(String s, String t) {

        Map<Character, Integer> map1= new HashMap<>();
         Map<Character, Integer> map2= new HashMap<>();

        for(char c: t.toCharArray()){
            map1.put(c, map1.getOrDefault(c,0)+1);
        }

        int formed=0;
        int need=map1.size();
        int left=0;
        int minLen=Integer.MAX_VALUE;
        int len=0;
        int start=0;


        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);

            map2.put(c, map2.getOrDefault(c,0)+1);

            if(map1.get(c)!=null && map1.get(c).intValue()==map2.get(c).intValue()){
                formed++;
            }
            len=i-left+1;

            while(formed==need){
                
                if(i-left+1<minLen){
                    minLen=i-left+1;
                    start=left;
                }
                char l=s.charAt(left);
                map2.put(l, map2.get(l)-1);

                

                if(map1.containsKey(l) && map2.get(l).intValue()<map1.get(l).intValue()){
                    formed--;
                }

                left++;
            }
        }

        return minLen==Integer.MAX_VALUE ? "": s.substring(start, start+minLen);
    }
    }

    

