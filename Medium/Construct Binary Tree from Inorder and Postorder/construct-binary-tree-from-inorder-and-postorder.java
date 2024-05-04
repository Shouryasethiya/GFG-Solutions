//{ Driver Code Starts
import java.util.*;

class Node {
    int data;
    Node left;
    Node right;

    Node(int value) {
        data = value;
        left = null;
        right = null;
    }
}

class InorderPostorderToTree {
    public void preOrder(Node root) {
        if (root == null) return;

        System.out.print(root.data + " ");
        preOrder(root.left);

        preOrder(root.right);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        InorderPostorderToTree ip = new InorderPostorderToTree();
        int T = sc.nextInt();
        while (T > 0) {
            int n = sc.nextInt();
            int inorder[] = new int[n];
            int postorder[] = new int[n];
            for (int i = 0; i < n; i++) inorder[i] = sc.nextInt();
            for (int i = 0; i < n; i++) postorder[i] = sc.nextInt();
            GfG g = new GfG();
            Node root = g.buildTree(inorder, postorder, n);
            ip.preOrder(root);
            System.out.println();

            T--;
        }
    }
}

// } Driver Code Ends


/* Tree node structure
class Node
{
    int data;
    Node left;
    Node right;

        Node(int value)
    {
        data = value;
        left = null;
        right = null;
    }
}*/


class GfG
{
    //Function to return a tree created from postorder and inoreder traversals.
     Node buildTree(int in[], int post[], int n) {
        // Your code here 
        Node startNode=null;
        return constructBinaryTree(in,post,0,in.length-1);
    }
    Node constructBinaryTree(int[] in,int[] post,int start,int end){
        if(start>end){
            return null;
        }
        if(start==end){
            return new Node(in[start]);
        }
        int index=0;
        boolean flag=false;
         Node startNode=null;
        for(int i=post.length-1;i>=0;i--){
            for(int j=start;j<=end;j++){
                if(post[i]==in[j]){
                 startNode=new Node(in[j]);
                    index=j;
                    flag=true;
                    break;
                    
                }
                
            }
            if(flag==true){
                break;
            }
        }
        startNode.left=constructBinaryTree(in,post,start,index-1);
         startNode.right=constructBinaryTree(in,post,index+1,end);
         
         return startNode;
       
    }
}
