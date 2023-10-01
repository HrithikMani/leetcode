class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i:nums){
            if(map.containsKey(i)){
                if(map.get(i)==1){
                    return true;
                }
            }else{
                map.put(i,1);
            }
        }
        return false;  
    }
}