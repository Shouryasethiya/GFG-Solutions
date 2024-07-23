//{ Driver Code Starts
//Initial Template for Java




import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int k = Integer.parseInt(inputLine[1]);
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            int ans = new Solution().minOperations(arr, n, k);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java





class Solution {
    int minOperations(int[] arr, int n, int k) {
        // code here
        int count =0;
        PriorityQueue<Integer> pq= new PriorityQueue<>();
        for(int y:arr){
            pq.add(y);
        }
            while(pq.size()>1 && pq.peek()<k){
                int f=pq.remove();
                int s=pq.remove();
                int res=s+f;
                pq.add(res);
                count++;
            }
        if(pq.peek()<k)
            return -1;
    
        return count;
    }
}
