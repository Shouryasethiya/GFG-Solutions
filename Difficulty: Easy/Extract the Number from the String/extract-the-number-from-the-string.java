//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;
import java.util.regex.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S = read.readLine();
            Solution ob = new Solution();
            System.out.println(ob.ExtractNumber(S));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    long ExtractNumber(String sentence) {
        // code here
        String arr[]=sentence.split(" ");
        long num=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i].charAt(0)<'A'){
                if(!arr[i].contains("9"))num=Math.max(num,Long.valueOf(arr[i]));
            }
        }
        return num;
    }
}

