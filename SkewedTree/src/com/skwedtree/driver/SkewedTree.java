package com.skwedtree.driver;

class Node{
	int key;
	Node left, right;


	Node (int data) {
		key=data;
		left=null;
		right=null;


	}
}
public class SkewedTree {

	public Node node;
	Node prevNode=null;
	Node headNode=null;
	public  void bstToRSkwed( Node root,int order) {

		if(root==null) {

			return;
		}
		if(order>0) {
			 bstToRSkwed(root.right,order);
		}
		else {
			 bstToRSkwed(root.left,order);

		}

		Node rightNode=root.right;
		Node leftNode=root.left;
		if(headNode==null) {
			headNode=root;
			root.left=null;
			prevNode=root;
		}
		else{
			prevNode.right=root;
		} 
		root.left=null;
		prevNode=root;
		if(order>0) {

			 bstToRSkwed(leftNode,order);

		}else {
			 bstToRSkwed(rightNode,order);


		}		

	}
	public void traverse(Node root) {
		if(root==null) {
			return;
		}
		System.out.print(root.key+" ");
		traverse(root.right);

	}
}
