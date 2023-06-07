class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        if(m==0) for(int i=0;i<n;i++) nums1[i]=nums2[i];
        int k=m+n-1;
        int i=m-1,j=n-1;

        while(j>=0 && i>=0){
            if(nums1[i]>=nums2[j]){
                nums1[k]=nums1[i];
                nums1[i]=0;
                i--;
                k--;
            }else{
                nums1[k]=nums2[j];
                nums2[j]=0;
                j--;
                k--;
            }
        }

        while(j>=0){
            nums1[k]=nums2[j];
            j--;
            k--;
        }


    }
}