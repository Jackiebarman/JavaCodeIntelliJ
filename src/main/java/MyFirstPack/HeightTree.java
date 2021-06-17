package MyFirstPack;
//class TreeNode{
//  int data;
//  TreeNode left;
//  TreeNode right;
//  TreeNode(int d){
//    this.data=d;
//    this.left=null;
//    this.right=null;
//  }
//}
public class HeightTree {
  public static class TreeNode{
    int data;
    TreeNode left;
    TreeNode right;
    TreeNode(int d){
      this.data=d;
      this.left=null;
      this.right=null;
    }
  }
  public static int height(TreeNode root)
  {
    if(root==null)
    {
      return 0;
    }
    int l=height(root.left);
    int r=height(root.right);
    return 1+Math.max(l,r);
  }
  public static void main(String[] args) {
    TreeNode root=new TreeNode(10);
    root.left=new TreeNode(7);
    root.right=new TreeNode(12);
    root.left.left=new TreeNode(3);
    root.right.left= new TreeNode(11);
    root.right.right=new TreeNode(23);
         int h=height(root);
         System.out.println(h);
  }
}
