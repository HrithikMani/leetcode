class Solution {
    public boolean isAnagram(String s, String t) {
         HashMap<Character,Integer> set1 = new HashMap<>();
          HashMap<Character,Integer> set2 = new HashMap<>();
         for(int i=0;i<s.length();i++){
            if(set1.containsKey(s.charAt(i))){
                
                set1.put(s.charAt(i), 1+ set1.get(s.charAt(i)));
            }else{
                set1.put(s.charAt(i), 0);
            }
         }


         for(int i=0;i<t.length();i++){
            if(set2.containsKey(t.charAt(i))){
                
                set2.put(t.charAt(i), 1+ set2.get(t.charAt(i)));
            }else{
                set2.put(t.charAt(i), 0);
            }
         }
        
         if(set1.equals(set2)){
             return true;
         }
         return false;
    }
}