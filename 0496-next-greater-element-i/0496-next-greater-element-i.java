class Solution {
    public int find(int nums2[],int k){
        if(k==nums2[nums2.length-1]){
            return -1;
        }
        int idx=0;
        
        for(int i=0;i<nums2.length-1;i++){
            if(nums2[i]==k){
                idx=i;
                break;
            }
        }
        for(int j=idx+1;j<nums2.length;j++){
            if(nums2[j]>k){
                return nums2[j];
            }
        }
        return -1;
    }
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int res[]=new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            res[i]=find(nums2,nums1[i]);
        }
        return res;
    }
}