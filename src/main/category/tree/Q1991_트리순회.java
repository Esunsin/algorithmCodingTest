package main.category.tree;

import groovy.console.ui.AstBrowser;

import java.util.Scanner;

public class Q1991_트리순회 {
    static class Node{ //노드 생성
        char data;
        Node left,right;
        public Node(char data){
            this.data = data;
        }
    }
    static class Tree{
        Node root;
        public void Add(char data, char dataLeft, char dataRight){
            if (root == null) {
                if(data!= '.') root = new Node(data);
                if(dataLeft != '.') root.left = new Node(dataLeft);
                if(dataRight != '.') root.right = new Node(dataRight);
            }
            else search(root,data, dataLeft,dataRight);

        }
        public void search(Node root,char data, char dataLeft, char dataRight){
            //root == null -> stop
            if(root == null) return;
            else if(root.data == data){ //data 있으면 넣기
                if(dataLeft!='.') root.left = new Node(dataLeft);
                if(dataRight!='.') root.right = new Node(dataRight);
            }
            else{
                search(root.left, data, dataLeft, dataRight);
                search(root.right, data, dataLeft, dataRight);
            }
        }
        /**
         * 전방순회
         */
        public void preOrder(Node root){
            System.out.print(root.data);
            if(root.left != null) preOrder(root.left);
            if(root.right != null) preOrder(root.right);

        }
        /**
         * 중위순회
         */
        public void inOrder(Node root){
            if(root.left != null) inOrder(root.left);
            System.out.print(root.data);
            if(root.right != null) inOrder(root.right);

        }
        /**
         * 후위순회
         */
        public void postOrder(Node root){
            if(root.left != null) postOrder(root.left);
            if(root.right != null) postOrder(root.right);
            System.out.print(root.data);

        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        Tree tree = new Tree();
        for (int i = 0; i < N; i++) {
            tree.Add(scanner.next().charAt(0),scanner.next().charAt(0),scanner.next().charAt(0));
        }
        tree.preOrder(tree.root);
        System.out.println();
        tree.inOrder(tree.root);
        System.out.println();
        tree.postOrder(tree.root);
        System.out.println();
    }
}
