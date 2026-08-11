package leetcode;

import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class ListNode {
    int val;
    ListNode next;

    // Constructors
    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

class Pair<K, V> {
    private final K key;
    private final V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }
}

class Main {
    public static void main(String[] args) {

        Solution sol = new Solution();

        // Verify if they are the same
        List<String> result = sol.wordBreak("catsanddog", new ArrayList<>(List.of("cat", "cats", "and", "sand", "dog")));

        System.out.println(result);

//        String generatedUuid = UUID.randomUUID().toString();
//        System.out.println(generatedUuid);
    }
}
