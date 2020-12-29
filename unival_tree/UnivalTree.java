class UnivalTree {
  // to create our unival tree
  public Node root;

  public static int countUnivalSubtrees = 0;

  public boolean numberUnivalSubTrees(Node node) {

    /*
     * End of our loop; when we arrive to the last leave of the tree. In case we
     * arrive to the last element of the tree ( the 1 1 in the bottom of the tree ),
     * we need to stop digging and start counting
     */
    if (node == null)
      return true;

    /*
     * Digging throught the tree and getting sub-trees
     */
    boolean left = numberUnivalSubTrees(node.left);
    boolean right = numberUnivalSubTrees(node.right);

    /*
     * If any of the subtrees is not unival, then this cannot be singly.
     */

    if (!left || !right) {
      return false;
    }

    /*
     * compring the value of the node with it's left and right if they are not equal
     * ==> then the subtree is not unival
     */

    if (node.left != null && node.nodeValue != node.left.nodeValue) {
      return false;
    }
    if (node.right != null && node.nodeValue != node.right.nodeValue) {
      return false;
    }

    /*
     * If none of the above conditions is true, then tree rooted under root is
     * single valued, increment count and return true.
     */
    countUnivalSubtrees++;
    return true;
  }
}
