package com.algorithm;

import org.junit.jupiter.api.Test;

class SearchBinaryTreeTest {

    @Test
    void searchNodeOK() {
        SearchBinaryTree bt = new SearchBinaryTree();
        SearchBinaryTree.Node root = new SearchBinaryTree.Node(4);
        root.left = new SearchBinaryTree.Node(2);
        root.right = new SearchBinaryTree.Node(7);
        root.left.left = new SearchBinaryTree.Node(1);
        root.left.right = new SearchBinaryTree.Node(3);
        SearchBinaryTree.Node node = bt.searchNode(root, 2);
    }

    @Test
    void searchBinaryThree() {
        SearchBinaryTree bt = new SearchBinaryTree();
        SearchBinaryTree.Node root = new SearchBinaryTree.Node(4);
        root.left = new SearchBinaryTree.Node(2);
        root.right = new SearchBinaryTree.Node(7);
        root.left.left = new SearchBinaryTree.Node(1);
        root.left.right = new SearchBinaryTree.Node(3);

        SearchBinaryTree.Node node = bt.searchBinaryThree(root, 2);
    }

    @Test
    void searchBST() {
        SearchBinaryTree bt = new SearchBinaryTree();
        SearchBinaryTree.Node root = new SearchBinaryTree.Node(4);
        root.left = new SearchBinaryTree.Node(2);
        root.right = new SearchBinaryTree.Node(7);
        root.left.left = new SearchBinaryTree.Node(1);
        root.left.right = new SearchBinaryTree.Node(3);

        SearchBinaryTree.Node node = bt.searchBST(root, 2);
    }
}