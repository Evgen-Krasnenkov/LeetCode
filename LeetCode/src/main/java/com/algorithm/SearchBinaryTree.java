package com.algorithm;

/**
 * https://leetcode.com/problems/search-in-a-binary-search-tree/
 */
public class SearchBinaryTree {
        
      public static class Node{
        int data;  
        Node left;  
        Node right;  
          
        public Node(int data, Node left, Node right){
            this.data = data;
            this.left = left;
            this.right = right;
        }

          public Node() {
          }

          public Node(int data) {
              this.data = data;
          }
      }

    public Node searchBST(Node root, int val) {
        if(root == null) return root;
        if(root.data == val){
            return root;
        }
        else{
            return val<root.data? searchBST(root.left,val):searchBST(root.right,val);
        }
    }
      public Node searchNode(Node temp, int value){
          if (temp == null) {
              return temp;
          }
          if (temp.data == value) {
              return temp;
          }
          if (temp.data > value) {
             return searchNode(temp.left, value);
          } else {
             return searchNode(temp.right, value);
          }
      }
      public Node searchBinaryThree(Node root, int value){
          while (root.data != value){
              if (root.data > value) {
                  root = root.left;
              } else {
                  root = root.right;
              }
          }
          return root;
       }
}