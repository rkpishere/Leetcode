class Solution {
    public int partition(int [] nums, int low, int high){
        int pivot=nums[high];
        int i=low-1;
        for(int j=low;j<high;j++){
            if(nums[j]<pivot){
                i++;
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
            }
        }
        i++;
        int temp=nums[i];
        nums[i]=pivot;
        nums[high]=temp;
        return i;
    }
    public void quicksort(int [] nums,int low,int high){
        if(low<high){
        int pivot=partition(nums,low,high);
        quicksort(nums,low,pivot-1);
        quicksort(nums,pivot+1,high);
    }
    }
    public void sortColors(int[] nums) {
        int n=nums.length;
        quicksort(nums,0,n-1);
    }
}