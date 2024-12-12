package br.dev.fagner;

public class Node {

	  // Fields
	  int data;
	  Node left;
	  Node right;

	  // Constructor
	  public Node(int data){
	    this.data = data;
	    left = null;
	    right = null;
	  }


	  // Accessors
	  // Setters
	  public void setLeft(Node node){
	    if (left == null) {
	      left = node;
	    }
	  }

	  public void setRight(Node node){
	    if (right == null){
	      right = node;
	    }
	  }

	  public void setData(int data){
	    this.data = data;
	  }


	  // Getters
	  public Node getLeft(){
	    return left;
	  }

	  public Node getRight(){
	    return right;
	  }

	  public int getData(){
	    return data;
	  }


	  // Tree traversal methods
	  void printPreorder(Node node){
	    if (node == null){
	      return;
	    }

	    System.out.println(node.data + " ");
	    printPreorder(node.left);
	    printPreorder(node.right);
	  }

	  void printPostorder(Node node){
	    if (node == null){
	      return;
	    }

	    printPostorder(node.left);
	    printPostorder(node.right);
	    System.out.println(node.data + " ");
	  }

	  void printInorder(Node node){
	    if (node == null){
	      return;
	    }

	    printInorder(node.left);
	    System.out.println(node.data + " ");
	    printInorder(node.right);
	  }

	  // Formatting tree structure
	  public String print(){
	    return this.print("",true,"");
	  }

	  public String print(String prefix, boolean isTail, String sb) {
	    if (right != null) {
	      right.print(prefix + (isTail ? "│ " : "    "), false, sb);
	    }
	    System.out.println( prefix+(isTail ? "\\-- " : "  /-- ")+data);
	    if (left != null) {
	      left.print(prefix+(isTail ? "    " : "  │   "), true, sb);
	    }
	    return sb;
	  }

	}