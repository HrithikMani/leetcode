class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int ans=0;
        for(int i=0;i<stones.length();i++){
            char k = stones.charAt(i);
            for(int x=0;x<jewels.length();x++){
                if(k == jewels.charAt(x)){
                    ans++;
                    break;
                }
            }
        }
        return ans;
    }
}