class Solution {
    public int maxSubArray(int[] nums) {
        int max=nums[0], sumnow=0, n=nums.length;
        for(int i=0;i<n;i++){
            sumnow+=nums[i];
            if(sumnow>=max) max=sumnow;
            if(sumnow<0) sumnow=0;
        }

        return max;
    }
}