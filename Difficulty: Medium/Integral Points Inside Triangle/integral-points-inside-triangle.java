//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S[] = read.readLine().split(" ");
            long p[] = new long[2];
            long q[] = new long[2];
            long r[] = new long[2];
            p[0] = Long.parseLong(S[0]);
            p[1] = Long.parseLong(S[1]);
            q[0] = Long.parseLong(S[2]);
            q[1] = Long.parseLong(S[3]);
            r[0] = Long.parseLong(S[4]);
            r[1] = Long.parseLong(S[5]);
            Solution ob = new Solution();
            long ans = ob.InternalCount(p, q, r);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    long InternalCount(long p[], long q[], long r[]) {
        
        Point P = new Point(p[0], p[1]);
        Point Q = new Point(q[0], q[1]);
        Point R = new Point(r[0], r[1]);
        long boundary = get1(P, Q) + get1(Q, R) + get1(R, P) + 3;
        long area = Math.abs(P.x * (Q.y - R.y) + Q.x * (R.y - P.y) + R.x * (P.y - Q.y));
        long internalPoints = (area - boundary + 2) / 2;
        return internalPoints;
    }
   public long get1(Point p, Point q) {
        if (p.x == q.x) return Math.abs(p.y - q.y) - 1;
        if (p.y == q.y) return Math.abs(p.x - q.x) - 1;
        return gcd(Math.abs(p.x - q.x), Math.abs(p.y - q.y)) - 1;
    }
    public long gcd(long a, long b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
    class Point {
        long x, y;
        Point(long x, long y) {
            this.x = x;
            this.y = y;
    }
}
}