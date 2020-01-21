package com.hackerrank;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class TreeLevelOrderTraversal {

	static void levelOrder(TNode root) {
	
		Queue<TNode> queue = new LinkedList<>();
		queue.add(root);
		while(!queue.isEmpty()) {
			TNode temp = queue.poll();
			print(temp);
			if(temp.left != null) {
				queue.add(temp.left);
			}
			if(temp.right != null){
				queue.add(temp.right);
			}
		}
	
	}
	
	static void print(TNode t) {
		System.out.print(t.data +" ");
	}

	public static TNode insert(TNode root, int data) {
		if (root == null) {
			return new TNode(data);
		} else {
			TNode cur;
			if (data <= root.data) {
				cur = insert(root.left, data);
				root.left = cur;
			} else {
				cur = insert(root.right, data);
				root.right = cur;
			}
			return root;
		}
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		TNode root = null;
		while (T-- > 0) {
			int data = sc.nextInt();
			root = insert(root, data);
		}
		levelOrder(root);
		sc.close();
	}
}

class TNode {
	TNode left, right;
	int data;

	TNode(int data) {
		this.data = data;
		left = right = null;
	}
}
