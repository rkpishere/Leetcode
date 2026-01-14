class Solution {
    public int maxSubArray(int[] nums) {
        int maxsum=Integer.MIN_VALUE;
        int currsum=0;
        for(int i:nums){
            currsum+=i;
         if(maxsum<currsum){
            maxsum=currsum;
         }
          if(currsum<0){
            currsum=0;
          }
        }
        return maxsum;
    }
}