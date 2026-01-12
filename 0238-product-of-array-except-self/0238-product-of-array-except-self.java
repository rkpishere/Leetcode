class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] prefix=new int[nums.length];
        int[] sufix=new int[nums.length];
        int temp=1;
        int temp2=1;
        int j=nums.length-1;
       for(int i=0;i<nums.length;i++){
        temp=temp*nums[i];
        prefix[i]=temp; //1,2,6,24
        temp2=temp2*nums[j];
        sufix[j]=temp2;
        j--;
       }

       for(int k=0;k<nums.length;k++){
        if(k==0){
            nums[k]=sufix[k+1];
        }
        else if(k==nums.length-1){
            nums[k]=prefix[k-1];
        }
        else{
        nums[k]=sufix[k+1]*prefix[k-1];
       }
       }
       return nums;
    }
}