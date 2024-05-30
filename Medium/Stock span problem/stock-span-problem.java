//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;


// } Driver Code Ends


class Solution
{
    //Function to calculate the span of stockâ€™s price for all n days.
    public static int[] calculateSpan(int price[], int n)
    {   int span[]=new int[price.length];
        Stack<Integer>s=new Stack<>();
        span[0]=1;
        s.push(0);
        for(int i=1;i<span.length;i++)
        
        {   int currprice=price[i];
            while(!s.isEmpty() && currprice>=price[s.peek()])
            {
                s.pop();
            }
            if(s.isEmpty())
            {
                span[i]=i+1;
            }
            else{
                int prevmax=s.peek();
                span[i]=i-prevmax;
            }
            s.push(i);
        }
        return span;
    }
    
}

//{ Driver Code Starts.

class gfg {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int a[] = new int[n];

            int i = 0;
            for (i = 0; i < n; i++) a[i] = sc.nextInt();

            int[] s = new Solution().calculateSpan(a, n);

            for (i = 0; i < n; i++) {
                System.out.print(s[i] + " ");
            }

            System.out.println();
        }
    }
}
// } Driver Code Ends