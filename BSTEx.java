//----------------------------------------------------------------------------
// BSTEx.java         by Crowell               Chapter 8
//
//  Test Driver for the BinarySearchTree class
//----------------------------------------------------------------------------

import ch08Trees.*;

public class BSTEx
{
  public static void main(String[] args) 
  {   
    
    BinarySearchTree<Integer> tree = new BinarySearchTree<Integer>();

    tree.add(7596);
    tree.add(726);
    tree.add(3895);
    tree.add(828);
    tree.add(62);
    tree.add(17478);
    tree.add(278);
    tree.add(77853);
    tree.add(32);
    
    tree.printTree();
    tree.printOutline();
    
    BinarySearchTree<Integer>emptyTree = new BinarySearchTree<Integer>();
    
    emptyTree.printTree();
    emptyTree.printOutline();
    
    

}
}

