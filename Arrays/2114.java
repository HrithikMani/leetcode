class Solution {
    public int mostWordsFound(String[] sentences) {
        int max = Integer.MIN_VALUE;
        for(String i:sentences){
            String[] sp =i.split(" ");
            if(sp.length>max){
                max = sp.length;
            }
        }
        return max;
    }
}