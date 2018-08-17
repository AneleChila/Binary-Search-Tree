// Hussein's Binary Search Tree
// 27 March 2017
// Hussein Suleman

public class BinarySearchTree<dataType extends Comparable<? super dataType>> extends BinaryTree<dataType>
{
   public void insert ( dataType k, dataType d )
   {
      if (root == null)
         root = new BinaryTreeNode<dataType> (k, d, null, null);
      else
         insert (k, d, root);
   }
   public void insert ( dataType k, dataType d, BinaryTreeNode<dataType> node )
   {
      if (k.compareTo (node.key) <= 0)
      {
         if (node.left == null)
            node.left = new BinaryTreeNode<dataType> (k, d, null, null);
         else
            insert (k, d, node.left);
      }
      else
      {
         if (node.right == null)
            node.right = new BinaryTreeNode<dataType> (k, d, null, null);
         else
            insert (k, d, node.right);
      }
   }
   
   public BinaryTreeNode<dataType> find (dataType k, dataType d )
   {
      key =  root;
      if (root == null)
         return null;
      else
         return find (k, d, root);
   }
   public BinaryTreeNode<dataType> find ( dataType k, dataType d, BinaryTreeNode<dataType> node )
   {
      if (k.compareTo (node.key) == 0) {
	 //System.out.println("ll");
         return node;
	}
      else if (k.compareTo (node.key) < 0)
         return (node.left == null) ? null : find (k, d, node.left);
      else
         return (node.right == null) ? null : find (k, d, node.right);
   }
   
   public void delete ( dataType d )
   {
      root = delete (d, root);
   }   
   public BinaryTreeNode<dataType> delete ( dataType d, BinaryTreeNode<dataType> node )
   {
      if (node == null) return null;
      if (d.compareTo (node.data) < 0)
         node.left = delete (d, node.left);
      else if (d.compareTo (node.data) > 0)
         node.right = delete (d, node.right);
      else if (node.left != null && node.right != null )
      {
         node.data = findMin (node.right).data;
         node.right = removeMin (node.right);
      }
      else
         if (node.left != null)
            node = node.left;
         else
            node = node.right;
      return node;
   }
   
   public BinaryTreeNode<dataType> findMin ( BinaryTreeNode<dataType> node )
   {
      if (node != null)
         while (node.left != null)
            node = node.left;
      return node;
   }

   public BinaryTreeNode<dataType> removeMin ( BinaryTreeNode<dataType> node )
   {
      if (node == null)
         return null;
      else if (node.left != null)
      {
         node.left = removeMin (node.left);
         return node;
      }
      else
         return node.right;
   }
   
}
