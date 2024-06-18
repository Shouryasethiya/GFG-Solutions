//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            int ans = ob.rectanglesInCircle(N);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    int rectanglesInCircle(int r) {
        int diameter = r << 1;
        int diameterSquare = diameter * diameter;
        
        int rectanglesCount = 0;
        int left = 1;
        int right = diameter;
        
        while (left < diameter && right >= 1) {
            if ((left * left) + (right * right) <= diameterSquare) {
                rectanglesCount += right;
                left++;
            } else {
                right--;
            }
        }
        return rectanglesCount;
    }
};