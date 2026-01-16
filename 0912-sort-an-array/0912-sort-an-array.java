class Solution {
    Random rand=new Random();
    public int partition(int []nums,int low,int high){
        int pivotIndex= low + rand.nextInt(high - low + 1);
         int temp = nums[pivotIndex];
        nums[pivotIndex] = nums[high];
        nums[high] = temp;
        int pivot = nums[high];
        int i = low - 1;
        for(int j=low;j<high;j++){
            if(nums[j]<pivot){
                i++;
                 temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
            }
        }
         i++;
         temp=nums[i];
        nums[i]=pivot;
        nums[high]=temp;
        return i;
    }
    public void quick(int [] nums,int low,int high){
        if(low<high)
        {
            int pivot=partition(nums, low, high);
            quick(nums,low,pivot-1);
            quick(nums,pivot+1,high);
        }
    }
    public int[] sortArray(int[] nums) {
        quick(nums,0,nums.length-1);
        return nums;
    }
}