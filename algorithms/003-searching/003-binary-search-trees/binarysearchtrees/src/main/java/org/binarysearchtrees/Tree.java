package org.binarysearchtrees;

public class Tree {

	private TreeNode root;

	public void insert(int value) {
		if (root == null) {
			root = new TreeNode(value);
		}
		else {
			root.insert(value);
		}
	}
	
	public int getRoot() {
		return root.getData();
	}

	public void setRoot(int rootValue) {
		this.root.setData(rootValue);
	}

	public void traverseInOrder() {
		if (root != null) {
			root.traverseInOrder();
		}
	}

}
