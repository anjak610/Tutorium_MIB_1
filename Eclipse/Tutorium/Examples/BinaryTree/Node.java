package Examples.BinaryTree;

class Node
{
  public Node left;
  public Node right;
  public String name;

  public Node(String name, Node left, Node right)
  {
    this.name  = name;
    this.left  = left;
    this.right = right;
  }
}