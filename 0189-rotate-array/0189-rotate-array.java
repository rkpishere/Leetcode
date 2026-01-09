class Solution {
    public void rotate(int[] nums, int k) {
        int i=0,j=0;
        int size=nums.length;
        int [] arr=new int[size];
        k=k%size;
        for(i=size-k;i<size;i++){
            arr[j++]=nums[i];
        }
        for(i=0;i<size-k;i++){
            arr[j++]=nums[i];
        }
        i=0;
        for(int a:arr){
            nums[i++]=a;
        }
    }
}