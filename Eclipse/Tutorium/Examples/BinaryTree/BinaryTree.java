package Examples.BinaryTree;

public class BinaryTree
{
 

  public static void preOrder(Node node)
  {
    System.out.print(node.name);
    if(node.left != null)
      preOrder(node.left);
    if(node.right != null)
      preOrder(node.right);
  }

  public static void inOrder(Node node)
  {
    if(node.left != null)
      inOrder(node.left);
    System.out.print(node.name);
    if(node.right != null)
      inOrder(node.right);
  }

  public static void postOrder(Node node)
  {
    if(node.left != null)
      postOrder(node.left);
    if(node.right != null)
      postOrder(node.right);
    System.out.print(node.name);
  }
 
}