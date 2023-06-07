import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {

    public static int[] missingAndRepeating(ArrayList<Integer> arr, long n) {
        // Write your code here
        
        long nsum=(n*(n+1))/2,n2sum=(n*(n+1)*(2*n+1))/6;

		long s1=0,s2=0;
		for(int i=0;i<n;i++){
			s1+=(long)arr.get(i);
			s2+=(long)arr.get(i)*(long)arr.get(i);
		}
		long xminusy=nsum-s1,x2minusy2=n2sum-s2;

		long xplusy=x2minusy2/xminusy;
		long x=(xminusy+xplusy)/2;
		long y=xplusy-x;

		return new int[]{(int)x,(int)y};
        
    }
}