package com.algorithm;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ValidateBinarySearchTreeTest {

    @Test
    public void givenBST_whenCheck_thenFalse() {
        ValidateBinarySearchTree validateBinarySearchTree = new ValidateBinarySearchTree();
        ValidateBinarySearchTree.TreeNode root = new ValidateBinarySearchTree.TreeNode(5);
        root.left = new ValidateBinarySearchTree.TreeNode(1);
        root.right = new ValidateBinarySearchTree.TreeNode(4);
        root.right.left = new ValidateBinarySearchTree.TreeNode(6);
        root.right.right = new ValidateBinarySearchTree.TreeNode(3);
        boolean validBST = validateBinarySearchTree.isValidBST(root);
        Assertions.assertFalse(validBST);
    }

    @Test
    public void givenBSTLeftNodeFalse_whenCheck_thenFalse() {
        ValidateBinarySearchTree validateBinarySearchTree = new ValidateBinarySearchTree();
        ValidateBinarySearchTree.TreeNode root = new ValidateBinarySearchTree.TreeNode(5);
        root.left = new ValidateBinarySearchTree.TreeNode(1);
        root.right = new ValidateBinarySearchTree.TreeNode(4);
        root.right.left = new ValidateBinarySearchTree.TreeNode(3);
        root.right.right = new ValidateBinarySearchTree.TreeNode(6);
        boolean validBST = validateBinarySearchTree.isValidBST(root);
        Assertions.assertFalse(validBST);
    }

    @Test
    public void givenBST1and1_whenCheck_thenFalse() {
        ValidateBinarySearchTree validateBinarySearchTree = new ValidateBinarySearchTree();
        ValidateBinarySearchTree.TreeNode root = new ValidateBinarySearchTree.TreeNode(1);
        root.left = new ValidateBinarySearchTree.TreeNode(1);
        boolean validBST = validateBinarySearchTree.isValidBST(root);
        Assertions.assertFalse(validBST);
    }
    @Test
    public void givenBST1and1Right_whenCheck_thenFalse() {
        ValidateBinarySearchTree validateBinarySearchTree = new ValidateBinarySearchTree();
        ValidateBinarySearchTree.TreeNode root = new ValidateBinarySearchTree.TreeNode(1);
        root.right = new ValidateBinarySearchTree.TreeNode(1);
        boolean validBST = validateBinarySearchTree.isValidBST(root);
        Assertions.assertFalse(validBST);
    }

    @Test
    public void givenBST231_whenCheck_thenFalse() {
        ValidateBinarySearchTree validateBinarySearchTree = new ValidateBinarySearchTree();
        ValidateBinarySearchTree.TreeNode root = new ValidateBinarySearchTree.TreeNode(2);
        root.left = new ValidateBinarySearchTree.TreeNode(1);
        root.right = new ValidateBinarySearchTree.TreeNode(3);
        boolean validBST = validateBinarySearchTree.isValidBST(root);
        Assertions.assertTrue(validBST);
    }

}
