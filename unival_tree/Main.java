/*
This problem was asked by Google.
A unival tree (which stands for "universal value") is a tree where all nodes under it have the same value.
Given the root to a binary tree, count the number of unival subtrees.
For example, the following tree has 5 unival subtrees:
          0
         / \
        1   0
           / \
          1   0
         / \
        1   1
*/
class Main {
  public static void main(String[] args) {
        UnivalTree tree = new UnivalTree(); 
        tree.root = new Node(0); 
        tree.root.left = new Node(1); 
        tree.root.right = new Node(0); 
        tree.root.right.right = new Node(0); 
        tree.root.right.left = new Node(1); 
        tree.root.right.left.left = new Node(1); 
        tree.root.right.left.right = new Node(1); 
        tree.numberUnivalSubTrees(tree.root);
        System.out.println("the number of unival subtrees are : " + UnivalTree.countUnivalSubtrees);
  }
}
