/*
Final Lab 5 Task 1(L5)
Implement the binary search tree using recursion and java.
 */
public class BST {
    class Node{
        int data;
        Node left;
        Node right;
    }
    public Node createANode(int element){
        Node node=new Node();
        node.data=element;
        node.right=null;
        node.left=null;
        return node;
    }
    public Node InsertANode(Node node,int element){
        if(node==null){
            return createANode(element);
        }
        else if(element<node.data){
            node.left=InsertANode(node.left,element);
        }
        else if(element>node.data){
            node.right=InsertANode(node.right,element);
        }
        return node;
    }
    public void searchInBst(Node node,int element){
        boolean isFound=false;
        if(node==null){
            return ;
        }
        while(node!=null){
            if(element<node.data){
                node=node.left;
            }
            else if(element>node.data){
                node=node.right;
            }
            else{
                isFound=true;
                break;
            }
        }
        if(isFound){
            System.out.println("Element Found");
        }
        else{
            System.out.println("There is no such element in the tree");
        }
    }
    public Node FindSuccessor(Node root){
        while(root.left != null)
            root = root.left;
        return root;
    }
    public Node deleteInBst(Node node, int element){
        if(node==null)
            return null;
        else if(element< node.data){
            node.left=deleteInBst(node.left,element);
        }
        else if(element>node.data){
            node.right=deleteInBst(node.right,element);
        }
        else{
            if(node.left==null && node.right==null){
                node=null;
                return node;
            }
            else if(node.left==null){
                Node temp=node;
                node=node.right;
                return node;
            }
            else if(node.right==null){
                Node temp=node;
                node=node.left;
                return node;
            }
            else {
                Node temp = FindSuccessor(node.right);
                node.data = temp.data;
                node.right = deleteInBst(node.right,temp.data);
            }
        }
        return node;
    }
    public void inOrder(Node node){
        if(node==null){
            return ;
        }
        else{
            inOrder(node.left);
            System.out.print(node.data+" ");
            inOrder(node.right);
        }
    }
    public void preOrder(Node node){
        if(node==null){
            return ;
        }
        else{
            System.out.print(node.data+" ");
            preOrder(node.left);
            preOrder(node.right);
        }
    }
    public void postOrder(Node node){
        if(node==null){
            return ;
        }
        else{
            postOrder(node.left);
            postOrder(node.right);
            System.out.print(node.data+" ");
        }
    }
    public static void main(String[] args) {
        BST bst=new BST();
        Node root=null;
        root=bst.InsertANode(root,8);
        root=bst.InsertANode(root,3);
        root=bst.InsertANode(root,6);
        root=bst.InsertANode(root,10);
        root=bst.InsertANode(root,4);
        root=bst.InsertANode(root,7);
        root=bst.InsertANode(root,1);
        root=bst.InsertANode(root,14);
        root=bst.InsertANode(root,13);
        System.out.print("In Order Traversal:");
        bst.inOrder(root);
        System.out.print("\nPre Order Traversal:");
        bst.preOrder(root);
        System.out.print("\nPost Order Traversal:");
        bst.postOrder(root);
        System.out.println();
        System.out.println("Element to be Searched:"+13);
        bst.searchInBst(root,13);
        bst.deleteInBst(root,8);
        System.out.println("After Deleting 8 from the tree");
        System.out.print("In Order Traversal:");
        bst.inOrder(root);
        System.out.print("\nPre Order Traversal:");
        bst.preOrder(root);
        System.out.print("\nPost Order Traversal:");
        bst.postOrder(root);
    }
}
