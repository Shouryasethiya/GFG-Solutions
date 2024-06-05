//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;


// } Driver Code Ends
// User function Template for Java

class Solution {
    long findSwapValues(long a[], int n, long b[], int m) {
        long sumA = 0, sumB = 0;
        
        // Calculate the sum of elements in both arrays
        for (int i = 0; i < n; i++) {
            sumA += a[i];
        }
        for (int i = 0; i < m; i++) {
            sumB += b[i];
        }
        
        // If the difference is not even, we cannot find such a pair
        long diff = sumB - sumA;
        if (diff % 2 != 0) {
            return -1;
        }
        
        // The target value difference to balance the sums by swapping
        long target = diff / 2;
        
        // Use a set to store elements of array b
        HashSet<Long> setB = new HashSet<>();
        for (int i = 0; i < m; i++) {
            setB.add(b[i]);
        }
        
        // Check for each element in array a if there exists a corresponding element in b
        for (int i = 0; i < n; i++) {
            long valA = a[i];
            long neededValB = valA + target;
            if (setB.contains(neededValB)) {
                return 1;
            }
        }
        
        return -1;
    }
}

//{ Driver Code Starts.

// Driver class
class Array {

    // Driver code
    public static void main(String[] args) throws IOException {
        // Taking input using buffered reader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testcases = Integer.parseInt(br.readLine());
        // looping through all testcases
        while (testcases-- > 0) {
            String line = br.readLine();
            String[] q = line.trim().split("\\s+");
            int n = Integer.parseInt(q[0]);
            int m = Integer.parseInt(q[1]);
            String line1 = br.readLine();
            String[] a1 = line1.trim().split("\\s+");
            long a[] = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(a1[i]);
            }
            String line2 = br.readLine();
            String[] a2 = line2.trim().split("\\s+");
            long b[] = new long[m];
            for (int i = 0; i < m; i++) {
                b[i] = Long.parseLong(a2[i]);
            }
            Solution ob = new Solution();
            long ans = ob.findSwapValues(a, n, b, m);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends