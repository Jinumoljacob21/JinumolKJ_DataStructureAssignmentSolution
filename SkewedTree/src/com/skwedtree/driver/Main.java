package com.skwedtree.driver;

public class Main {	

	public static void main(String args[]) {

		SkewedTree sk=new SkewedTree();
		sk.node=new Node(50);
		sk.node.left=new Node(30);
		sk.node.right=new Node(60);
		sk.node.left.left=new Node(10);
		sk.node.right.left=new Node(55);

		int order=0;


		sk. bstToRSkwed(sk.node,order);

		sk.traverse(sk.headNode);



	}




}	




