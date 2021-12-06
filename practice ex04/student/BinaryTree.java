//HIDE
import java.util.*;
/**
   A binary tree in which each node has two children.
*/
public class BinaryTree
{
   public Node root;

   /**
      Constructs an empty tree.
   */
   public BinaryTree() { root = null; }

   /**
      Constructs a tree with one node and no children.
      @param rootData the data for the root
   */
   public BinaryTree(Object rootData)
   {
      root = new Node();
      root.data = rootData;
      root.left = null;
      root.right = null;
   }

   /**
      Constructs a binary tree.
      @param rootData the data for the root
      @param left the left subtree
      @param right the right subtree
   */
   public BinaryTree(Object rootData, BinaryTree left, BinaryTree right)
   {
      root = new Node();
      root.data = rootData;
      root.left = left.root;
      root.right = right.root;
   }

   class Node
   {
      public Object data;
      public Node left;
      public Node right;
   }

   /**
      Returns the height of the subtree whose root is the given node.
      @param n a node or null
      @return the height of the subtree, or 0 if n is null
   */
   private static int height(Node n)
   {
      if (n == null) { return 0; }
      else { return 1 + Math.max(height(n.left), height(n.right)); }
   }

   /**
      Returns the height of this tree.
      @return the height
   */
   public int height() { return height(root); }

   /**
      Checks whether this tree is empty.
      @return true if this tree is empty
   */
   public boolean isEmpty() { return root == null; }

   /**
      Gets the data at the root of this tree.
      @return the root data
   */
   public Object data() { return root.data; }
   
   public Node getRoot()
   {
       return root;
   }

   /**
      Gets the left subtree of this tree.
      @return the left child of the root
   */
   public BinaryTree left()
   {
      BinaryTree result = new BinaryTree();
      result.root = root.left;
      return result;
   }

   /**
      Gets the right subtree of this tree.
      @return the right child of the root
   */
   public BinaryTree right()
   {
      BinaryTree result = new BinaryTree();
      result.root = root.right;
      return result;
   }
   
   public void addLeft(BinaryTree newTree)
   {
       this.root.left = newTree.root;
   }
   
   public void addRight(BinaryTree newTree)
   {
       this.root.right = newTree.root;
   }
   
   public void replace(BinaryTree newTree) {
     this.root = newTree.root;  
     System.out.println(this.root.data);
   }
   
   public void levelPrint()
   {
       Queue<Node> q = new LinkedList<>();
       //q.add(this);
       while (!q.isEmpty())
       {
           Node temp = q.remove();
           System.out.print(temp.data + " ");
           if (temp.left != null) q.add(temp.left);
           if (temp.right != null) q.add(temp.right);
       }    
       System.out.println();
   }
   
   public void swap(BinaryTree parent)
   {
       if (parent.right() != null && parent.left() != null)
       {
           BinaryTree right = parent.right();
           BinaryTree left = parent.left();
           parent.right().replace(left);
           parent.left().replace(right);
       }
       else if (parent.right() == null) 
       {
           parent.right().replace(parent.left());
           parent.left().replace(null);
       }
       else if (parent.left() == null) 
       {
           parent.left().replace(parent.right());
           parent.right().replace(null);
       }
   }
   
   public String toString(){
     String output = "";
     if (this.height() == 1) {
          output+=this.data();
        } else {
          output+= this.data() + "->" + this.left() +"----"+this.right();
        }
        return output;
    }
}
