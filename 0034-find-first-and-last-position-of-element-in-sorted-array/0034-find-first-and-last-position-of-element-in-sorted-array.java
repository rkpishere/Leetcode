class Solution {
    public int first(int [] nums, int target){
        int low=0;
        int high=nums.length-1;
        int res=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]==target){
                res=mid;
                high=mid-1;
            }
            else if(nums[mid]>target){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return res;
    }
    public int last(int [] nums,int target){
        int low=0;
        int high=nums.length-1;
        int res=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]==target){
                res=mid;
                low=mid+1;
            }
            else if(nums[mid]>target){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return res;
    }
    public int[] searchRange(int[] nums, int target) {
        int []ans={-1,-1};
        ans[0]=first(nums,target);
        if(ans[0]==-1){
            return ans;
        }
        ans[1]=last(nums,target);
        return ans;
    }
}