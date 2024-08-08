// 1. Write a java program for the Tree Tranversal of Preorder , Inorder and Postorder Tranversal.
// write a program Seperately.

/*
 * // 1.1 Preorder traversal
 * 
 * 
 * import java.util.*;
 * public class TreeNode{
 * int value;
 * TreeNode left,right;
 * TreeNode(int value){
 * this.value=value;
 * left=right=null;
 * }
 * }
 * 
 * class TreeTraversal{
 * public void preorder(TreeNode node){
 * if(node==null)
 * return;
 * System.out.print(node.value+" ");
 * preorder(node.left);
 * preorder(node.right);
 * }
 * 
 * public static void main(String[] args)
 * {
 * TreeNode root=new TreeNode(1);
 * root.left=new TreeNode(2);
 * root.right=new TreeNode(3);
 * root.left.left= new TreeNode(4);
 * root.left.right= new TreeNode(5);
 * TreeTraversal tree=new TreeTraversal();
 * System.out.print("Preorder traversal:");
 * tree.preorder(root);
 * // o/p : Preorder traversal:1 2 4 5 3
 * 
 * }
 * }
 * 
 */

/*
 * // 1.2 Inorder traversal
 * 
 * import java.util.*;
 * public class TreeNode{
 * int value;
 * TreeNode left,right;
 * TreeNode(int value){
 * this.value=value;
 * left=right=null;
 * 
 * }
 * }
 * class TreeTraversal{
 * public void inorder(TreeNode node){
 * if(node==null)
 * return;
 * inorder(node.left);
 * System.out.print(node.value+" ");
 * inorder(node.right);
 * 
 * }
 * 
 * public static void main(String[] args)
 * {
 * TreeNode root=new TreeNode(1);
 * root.left=new TreeNode(2);
 * root.right=new TreeNode(3);
 * root.left.left= new TreeNode(4);
 * root.left.right= new TreeNode(5);
 * TreeTraversal tree=new TreeTraversal();
 * System.out.print("inorder traversal:");
 * tree.inorder(root);
 * // o/p : inorder traversal:4 2 5 1 3
 * 
 * }
 * }
 * 
 */

/*
 * // 1.3 postorder traversal
 * 
 * import java.util.*;
 * public class TreeNode{
 * int value;
 * TreeNode left,right;
 * TreeNode(int value){
 * this.value=value;
 * left=right=null;
 * 
 * }
 * }
 * class TreeTraversal{
 * public void postorder(TreeNode node){
 * if(node==null)
 * return;
 * postorder(node.left);
 * postorder(node.right);
 * System.out.print(node.value+" ");
 * }
 * 
 * public static void main(String[] args)
 * {
 * TreeNode root=new TreeNode(1);
 * root.left=new TreeNode(2);
 * root.right=new TreeNode(3);
 * root.left.left= new TreeNode(4);
 * root.left.right= new TreeNode(5);
 * TreeTraversal tree=new TreeTraversal();
 * System.out.print("Postorder traversal:");
 * tree.postorder(root);
 * // o/p : Postorder traversal:4 5 2 3 1
 * 
 * }
 * }
 * 
 */

/*
 * // 2. Write a java program for the Tree Tranversal of Preorder , Inorder and Postorder Tranversal.
 * // write a program in integrated method.
 * 
 * 
 * import java.util.*;
 * public class TreeNode{
 * int value;
 * TreeNode left,right;
 * TreeNode(int value){
 * this.value=value;
 * left=right=null;
 * 
 * }
 * }
 * class TreeTraversal{
 * public void preorder(TreeNode node){
 * if(node==null)
 * return;
 * System.out.print(node.value+" ");
 * preorder(node.left);
 * preorder(node.right);
 * 
 * }
 * public void inorder(TreeNode node){
 * if(node==null)
 * return;
 * inorder(node.left);
 * System.out.print(node.value+" ");
 * inorder(node.right);
 * }
 * public void postorder(TreeNode node){
 * if(node==null)
 * return;
 * postorder(node.left);
 * postorder(node.right);
 * System.out.print(node.value+" ");
 * }
 * 
 * public static void main(String[] args)
 * {
 * TreeNode root=new TreeNode(1);
 * root.left=new TreeNode(2);
 * root.left.left= new TreeNode(4);
 * root.left.right= new TreeNode(5);
 * root.left.right.left= new TreeNode(8);
 * root.right=new TreeNode(3);
 * root.right.left= new TreeNode(6);
 * root.right.right= new TreeNode(7);
 * root.right.right.left= new TreeNode(9);
 * root.right.right.right= new TreeNode(10);
 * TreeTraversal tree=new TreeTraversal();
 * System.out.println("Postorder Traversal:");
 * tree.postorder(root);
 * System.out.println("\nPreorder Traversal:");
 * tree.preorder(root);
 * System.out.println("\nInorder Traversal:");
 * tree.inorder(root);
 * // o/p : Postorder Traversal:
 * // 4 8 5 2 6 9 10 7 3 1
 * // Preorder Traversal:
 * // 1 2 4 5 8 3 6 7 9 10
 * // Inorder Traversal:
 * // 4 2 8 5 1 6 3 9 7 10
 * }
 * }
 * 
 */

/*
 * // 3. Write a java program for the Tree Tranversal of Preorder , Inorder and Postorder Tranversal.
 * // write a program in integrated method.
 * 
 * 
 * import java.util.*;
 * public class TreeNode{
 * int value;
 * TreeNode left,right;
 * TreeNode(int value){
 * this.value=value;
 * left=right=null;
 * 
 * }
 * }
 * class TreeTraversal{
 * public void preorder(TreeNode node){
 * if(node==null)
 * return;
 * System.out.print(node.value+" ");
 * preorder(node.left);
 * preorder(node.right);
 * 
 * }
 * public void inorder(TreeNode node){
 * if(node==null)
 * return;
 * inorder(node.left);
 * System.out.print(node.value+" ");
 * inorder(node.right);
 * }
 * public void postorder(TreeNode node){
 * if(node==null)
 * return;
 * postorder(node.left);
 * postorder(node.right);
 * System.out.print(node.value+" ");
 * }
 * 
 * public static void main(String[] args)
 * {
 * TreeNode root=new TreeNode(4);
 * root.left=new TreeNode(2);
 * root.left.left= new TreeNode(3);
 * root.left.left.right= new TreeNode(9);
 * root.left.left.right.left= new TreeNode(1);
 * root.right=new TreeNode(5);
 * root.right.left= new TreeNode(7);
 * root.right.right= new TreeNode(6);
 * root.right.right.left= new TreeNode(8);
 * TreeTraversal tree=new TreeTraversal();
 * System.out.println("Preorder Traversal:");
 * tree.preorder(root);
 * System.out.println("\nInorder Traversal:");
 * tree.inorder(root);
 * System.out.println("\nPostorder Traversal:");
 * tree.postorder(root);
 * }
 * } // o/p :Preorder Traversal:
 * // 4 2 3 9 1 5 7 6 8
 * // Inorder Traversal:
 * // 3 1 9 2 4 7 5 8 6
 * // Postorder Traversal:
 * // 1 9 3 2 7 8 6 5 4
 */

/*
 * // 4. Write a java program for the Tree Tranversal of Preorder , Inorder and Postorder Tranversal.
 * // write a program in integrated method.
 * 
 * 
 * import java.util.*;
 * public class TreeNode{
 * int value;
 * TreeNode left,right;
 * TreeNode(int value){
 * this.value=value;
 * left=right=null;
 * 
 * }
 * }
 * class TreeTraversal{
 * public void preorder(TreeNode node){
 * if(node==null)
 * return;
 * System.out.print(node.value+" ");
 * preorder(node.left);
 * preorder(node.right);
 * 
 * }
 * public void inorder(TreeNode node){
 * if(node==null)
 * return;
 * inorder(node.left);
 * System.out.print(node.value+" ");
 * inorder(node.right);
 * }
 * public void postorder(TreeNode node){
 * if(node==null)
 * return;
 * postorder(node.left);
 * postorder(node.right);
 * System.out.print(node.value+" ");
 * }
 * 
 * public static void main(String[] args)
 * {
 * TreeNode root=new TreeNode(1);
 * root.left=new TreeNode(2);
 * root.left.left=new TreeNode(7);
 * root.left.right=new TreeNode(8);
 * root.left.left.left=new TreeNode(9);
 * root.right=new TreeNode(3);
 * root.right.right=new TreeNode(4);
 * root.right.right.left=new TreeNode(5);
 * root.right.right.left.right=new TreeNode(6);
 * 
 * TreeTraversal tree=new TreeTraversal();
 * System.out.println("Preorder Traversal:");
 * tree.preorder(root);
 * System.out.println("\nInorder Traversal:");
 * tree.inorder(root);
 * System.out.println("\nPostorder Traversal:");
 * tree.postorder(root);
 * }
 * }
 * 
 * // o/p : Preorder Traversal:
 * // 1 2 7 9 8 3 4 5 6
 * // Inorder Traversal:
 * // 9 7 2 8 1 3 5 6 4
 * // Postorder Traversal:
 * // 9 7 8 2 6 5 4 3 1
 * 
 */
