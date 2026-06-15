package day11;
import java.util.Scanner;

 class Node {
    int data;
    Node left;
    Node right;
    public Node(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }

    
}
public class BST{
    public Node insert(Node root,int newdata){
        Node newNode=new Node(newdata);
        if(root==null){
            root=newNode;
        }
        if(newdata<root.data){
            root.left=insert(root.left,newdata);
        }
        if(newdata>root.data){
            root.right=insert(root.right,newdata);
        }
        return root;
    }
    public void inOrder(Node root){
        if(root==null)
            return;
        else{
            inOrder(root.left);
            System.out.println(root.data+ " ");
            inOrder(root.right);
        }
    }
    public static void main(String[] args) {
        Node root=null;
        Scanner sc=new Scanner(System.in);
        BST bst_obj=new BST();
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int newdata=sc.nextInt();
            root=bst_obj.insert(root,newdata);
        }
        System.out.println();
        bst_obj.inOrder(root);
    }

}