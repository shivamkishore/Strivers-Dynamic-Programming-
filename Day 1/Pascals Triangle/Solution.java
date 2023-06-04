

class Solution {
    public long ncr(int n,int r){
        long ans=1;
        for(int i=n;i>n-r;i--){
            ans*=i;
        }
        for(int i=1;i<=r;i++){
            ans/=i;
        }
        return ans;
    }

   public List<Integer> row(int n){
       List<Integer> pascalrow=new ArrayList<>();
       pascalrow.add(1);
       int ans=1;
       for(int i=1;i<n;i++){
           ans=ans*(n-i);
           ans=ans/i;
           pascalrow.add(ans);
       }

       return pascalrow;
    }
   public List<List<Integer>> generate(int numRows) {
       
       List<List<Integer>> ans=new ArrayList<>();

       for(int i=1;i<=numRows;i++){
           ans.add(row(i));
       }
       return ans;
   }
}