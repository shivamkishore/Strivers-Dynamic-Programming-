class Solution {
    public void swap(int[] nums, int i, int j){
        int t=nums[i];
        nums[i]=nums[j];
        nums[j]=t;
    }
    public void reverse(int[] nums,int begin, int end){
        while(begin<end){
            swap(nums,begin,end);
            begin++;
            end--;
        }
    }
    public void nextPermutation(int[] nums) {
        int n=nums.length,breakpoint=-1;
        for(int i=n-2;i>=0;i--){
            if(nums[i]<nums[i+1]){ 
                breakpoint=i;
                break;
            } 
        }
        if(breakpoint==-1){
            reverse(nums,0,n-1);}
        else{
            for(int i=n-1;i>=0;i--){
            if(nums[i]>nums[breakpoint]){ 
                swap(nums,i,breakpoint);
                break;
                }
                }
                reverse(nums,breakpoint+1,n-1);
                }
        return;
    }
}