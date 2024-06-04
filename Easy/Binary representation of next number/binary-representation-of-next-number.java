//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;

class GfG {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            Solution ob = new Solution();
            System.out.println(ob.binaryNextNumber(s));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    String binaryNextNumber(String s) {
     
        // code here.
      int n=s.length();
        
        int i=s.lastIndexOf('0');
        String ans;
        if(i==-1) ans= "1"+"0".repeat(n);
        else ans= s.substring(0,i)+"1"+"0".repeat(n-i-1);
        
        return ans.substring(ans.indexOf('1'));//return by removing initial zeros
    }
}