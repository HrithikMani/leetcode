class Solution {
    public int[] runningSum(int[] nums) {
        int a[]= new int[nums.length];
        int prev=0;
        for(int i=0;i<nums.length;i++){
            int val = prev+nums[i];
            a[i]=val;
            prev=a[i];
        }
        return a;
    }
}