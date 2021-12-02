import java.util.*;
/**
 * Write a description of class InOrderTraversalTest here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class InOrderTraversalTest
{
   public static void main(String[] args)
   {
       BinaryTree letterTree = new BinaryTree("D",
         new BinaryTree("B",
         
                new BinaryTree("A"),
                   
                     new BinaryTree("C")),

                     
             new BinaryTree("F",
                new BinaryTree("E"),
                
                    new BinaryTree("G")));
       
       System.out.println(letterTree.inOrderTraversal());
   }
}
