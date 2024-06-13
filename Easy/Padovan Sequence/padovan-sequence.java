//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    int n = sc.nextInt();
                    Solution ob = new Solution();
                    System.out.println(ob.padovanSequence(n));
                }
        }
}    
// } Driver Code Ends


//User function Template for Java
class Solution
{
  public int padovanSequence(int n)
    {
        if(n==0 || n==1 ||n==2) return 1;
        //It is clear that the sum of nth number is sum of (n-1)th number and (n-2)th number
        //So the aim is get the two numbers
        int nth_Number = 1;
        int n_Minus_Oneth_Number = 1;
        int n_Minus_twoth_Number = 1;
        int result = 0;
        for(int i = 3; i<=n; i++)
        {
            result = (n_Minus_Oneth_Number + n_Minus_twoth_Number)%1000000007;
            n_Minus_twoth_Number = n_Minus_Oneth_Number;
            n_Minus_Oneth_Number = nth_Number;
            nth_Number = result;
        }
        
        return result;
    }
    
}