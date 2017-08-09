package jul2017;

import java.util.ArrayList;
import java.util.List;

import common.TreeNode;


/**
 * Average of Levels in Binary Tree
 * 给定一个非空的二叉树，求出各个节点的平均值
 * 输入： 
 *   3 
 *  / \ 
 * 9 20 
 *   / \ 
 *  15 7 输出： [3，14.5，11]
 * 说明： 
 * 0级节点的平均值为3，级别1为14.5，级别2为11.因此返回[3 ，14.5,11]。
 * @author ZGJ
 * @date 2017年7月10日
 */
public class Question637 {
	/**
	 * dfs
	 * @param root
	 * @return
	 */
    public List<Double> averageOfLevels(TreeNode root) {
        List<Integer> count = new ArrayList<>();
        List<Double> res = new ArrayList<>();
        average(root, 0, res, count);
        int len = count.size();
        for(int i = 0; i < len; i++) {
        	res.set(i, res.get(i) / count.get(i));
        }
		return res;
    }

	private void average(TreeNode t, int i, List<Double> sum, List<Integer> count) {
		if(t == null) 
			return;
		if(i < sum.size()) {
			sum.set(i, sum.get(i) + t.val);
			count.set(i, count.get(i) + 1);
		} else {//最后一个结点
			sum.add(1.0 * t.val);
			count.add(1);
		}
		average(t.left, i + 1, sum, count);
		average(t.right, i + 1, sum, count);
	}
}