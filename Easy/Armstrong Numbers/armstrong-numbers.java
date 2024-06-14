//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(read.readLine());
            Solution ob = new Solution();

            System.out.println(ob.armstrongNumber(n));
        }
    }
}
// } Driver Code Ends


// User function Template for Java
class Solution {
    static String armstrongNumber(int n) {
        // code here
        int cpy = n; //storing a copy of n
        int s = 0; //declaring sum s
        while(cpy>0)
        {
            s+=Math.pow(cpy%10,3); // calculating sum of cube of digits of n
            cpy/=10;
        }
        if(s==n) return "true";
        return "false";
    }
}