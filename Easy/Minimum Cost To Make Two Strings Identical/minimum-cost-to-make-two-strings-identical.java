//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GfG {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String X = sc.next();
            String Y = sc.next();
            int costX = sc.nextInt();
            int costY = sc.nextInt();

            Solution ob = new Solution();
            System.out.println(ob.findMinCost(X, Y, costX, costY));
        }
    }
}
// } Driver Code Ends


class Solution {
      public int findMinCost(String x, String y, int costX, int costY) {
        
        int n=x.length(), m=y.length();
        // int dp[][] = new int[n+1][m+1];
        int cur[] = new int[m+1], prev[] = new int[m+1];
        
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(x.charAt(i-1)==y.charAt(j-1)){
                    // dp[i][j] = dp[i-1][j-1] + 1;
                    cur[j] = prev[j-1] + 1;
                }else{
                    // dp[i][j] = Math.max(dp[i][j-1], dp[i-1][j]);
                    cur[j] = Math.max( cur[j-1], prev[j] );
                }
            }
            
            prev = cur;
            cur = new int[m+1];
        }
        
        // int common = dp[n][m];
        int common = prev[m];
        
        int del1 = n-common;
        int del2 = m-common;
        
        return del1*costX + del2*costY;
    }
}
