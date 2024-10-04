package LeetCode;

import java.util.*;

public class TreeTraversalBFS {
    List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> levelOrder(TreeNode root) {
        checkFun02(root);
        return result;

    }

    public void checkFun01(TreeNode node, Integer deep){
        if(node == null) return;
        deep++;
        if(result.size() < deep){
            List<Integer> item = new ArrayList<Integer>();
            result.add(item);
        }
        result.get(deep -1 ).add(node.val);
        checkFun01(node.left, deep);
        checkFun01(node.right, deep);
    }

    public void checkFun02(TreeNode node){

        if(node == null){
            return;
        }
        Queue<TreeNode> que = new LinkedList<TreeNode>();
        que.offer(node);
        while(!que.isEmpty()){
            List<Integer> itemList = new ArrayList<Integer>();
            int len = que.size();
            while(len>0){
                TreeNode tmpNode = que.poll();
                itemList.add(tmpNode.val);
                if(tmpNode.left != null){
                    que.offer(tmpNode.left);
                }
                if(tmpNode.right != null){
                    que.offer(tmpNode.right);
                }
                len --;
            }
            result.add(itemList);
        }
    }
}
