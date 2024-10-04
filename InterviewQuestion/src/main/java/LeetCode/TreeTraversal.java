package LeetCode;

import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.List;

//Contain Leetcode 144, 145, 94
public class TreeTraversal {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();

        preOrder(root, result);


        return result;
    }

    //Leetcode 144 Preorder: 前序
    public void preOrder(TreeNode root, List<Integer> result){
        if(root == null){
            return;
        }
        result.add(root.val);
        preOrder(root.left, result);
        preOrder(root.right, result);
    }

    //Leetcode 145 Postorder: 后序
    public void postOrder(TreeNode root, List<Integer> result){
        if(root == null){
            return;
        }
        postOrder(root.left,result);
        postOrder(root.right, result);
        result.add(root.val);
    }

    public void inOrder(TreeNode root, List<Integer> result){
        if(root == null){
            return;
        }
        inOrder(root.left, result);
        result.add(root.val);
        inOrder(root.right, result);

    }
}
