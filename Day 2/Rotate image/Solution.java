class Solution {
    public void rotate(int[][] mat) {
        //transpose
        int n=mat.length,m=mat[0].length;

        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
           //     swap(mat[i][j],mat[j][i]);
                int t=mat[i][j];
                mat[i][j]=mat[j][i];
                mat[j][i]=t;
            }
        }

        //swapping columns
        int i=0,j=n-1;
        while(i<j){
            for(int k=0;k<n;k++){
                //swap(mat[k][i],mat[k][j]);
                 int t=mat[k][i];
                mat[k][i]=mat[k][j];
                mat[k][j]=t;
            }
            i++;
            j--;
        }

    }
}