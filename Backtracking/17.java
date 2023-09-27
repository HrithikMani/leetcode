class Solution {
    public List<String> letterCombinations(String digits) {
        
        HashMap<Integer,String> map = new HashMap<>();
        map.put(2,"abc");
        map.put(3,"def");
        map.put(4,"ghi");
        map.put(5,"jkl");
        map.put(6,"mno");
        map.put(7,"pqrs");
        map.put(8,"tuv");
        map.put(9,"wxyz");

        
        if(digits.length() == 0){
            ArrayList<String> k = new ArrayList<String>();
            return k;
        }





        return fun(digits,map);

    }

    public ArrayList<String> fun(String str,  HashMap<Integer,String> map){
      
        if(str.length() == 0){
            ArrayList<String> k = new ArrayList<String>();
            k.add("");
            return k;
        }
        ArrayList<String> answers = new ArrayList<String>();
        int digit = Integer.parseInt(str.charAt(0)+"");
        String s = map.get(digit);
        
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);    
            //System.out.println(ch);
            ArrayList<String> x = fun(str.substring(1),map);
            
            for(String q : x){
                answers.add(ch+q);
            }
    }
    return answers;
    }
}