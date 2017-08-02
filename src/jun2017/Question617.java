package jun2017;

/**
 * Merge Two Binary Trees
 * 合并两棵二叉树，如歌两个结点都有值，相加，否则哪个结点有值使用哪个
 * Input: 
		Tree 1                     Tree 2                  
	          1                         2                             
	         / \                       / \                            
	        3   2                     1   3                        
	       /                           \   \                      
	      5                             4   7                  
	Output: 
	Merged tree:
		     3
		    / \
		   4   5
		  / \   \ 
		 5   4   7
 * @author ZGJ
 * @date 2017年6月15日
 */
public class Question617 {
	/**
	 * 递归方式
	 * @param t1 左子树
	 * @param t2 右子树
	 * @return
	 */
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
    	if(t1 == null && t2 == null) {
    		return null;
    	}
    	/**
    	 * 哪个结点为空，就用另外个结点替代
    	 */
        if(t1 == null) {
            return t2;
        }
        if(t2 == null) {
            return t1;
        }
        t1.val += t2.val;
        //左右子树分别递归
        t1.left = mergeTrees(t1.left, t2.left);
        t1.right = mergeTrees(t1.right, t2.right);
        return t1;
    }
}
/**
 * 树节点
 * @author ZGJ
 * @date 2017年6月15日
 */
class TreeNode {
	int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}