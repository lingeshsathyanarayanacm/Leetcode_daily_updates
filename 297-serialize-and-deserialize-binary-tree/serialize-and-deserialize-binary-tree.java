import java.util.*;

public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        List<String> cse = new LinkedList<>();
        serializeHelper(root, cse);
        return String.join(",", cse); // Join the list to form a single string
    }

    private void serializeHelper(TreeNode root, List<String> cse) {
        if (root == null) {
            cse.add("null");
        } else {
            cse.add(String.valueOf(root.val));
            serializeHelper(root.left, cse);  // Serialize left subtree
            serializeHelper(root.right, cse); // Serialize right subtree
        }
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] values = data.split(",");
        Queue<String> queue = new LinkedList<>(Arrays.asList(values));
        return buildTree(queue);
    }

    private TreeNode buildTree(Queue<String> queue) {
        if (queue.isEmpty()) {
            return null;
        }

        String value = queue.poll();

        if (value.equals("null")) {
            return null; // Null value indicates no node at this position
        }

        TreeNode node = new TreeNode(Integer.parseInt(value)); // Create the node
        node.left = buildTree(queue); // Recursively build the left subtree
        node.right = buildTree(queue); // Recursively build the right subtree

        return node;
    }
}

// Definition for a binary tree node.
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}
