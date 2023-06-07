import java.util.*;
class Solution {
    public int[][] merge(int[][] intervals) {

        Arrays.sort(intervals, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                return a[0] - b[0];
            }
        });
        int n=intervals.length,m=intervals[0].length;

        ArrayList<ArrayList<Integer>> ans= new ArrayList<>();

        for(int i=0;i<n;i++){
            if(ans.isEmpty() || intervals[i][0]>ans.get(ans.size()-1).get(1)){
                ArrayList<Integer> temp= new ArrayList<>();
                
                temp.add(intervals[i][0]);
                temp.add(intervals[i][1]);

                ans.add(temp);
            }else{
                ans.get(ans.size()-1).set(1,Math.max(intervals[i][1],ans.get(ans.size()-1).get(1) ));
            }
        }

        int[][] fin=new int[ans.size()][ans.get(0).size()];

        for(int i=0;i<ans.size();i++){
            for(int j=0;j<ans.get(0).size();j++){
                fin[i][j]=ans.get(i).get(j);
            }
        }

    return fin;
    }
}