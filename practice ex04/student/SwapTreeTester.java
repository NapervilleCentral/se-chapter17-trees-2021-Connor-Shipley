/**
   This program tests the binary search tree class.
*/
public class SwapTreeTester
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
      
      letterTree.swap(letterTree);
      letterTree.levelPrint();
   }
}

