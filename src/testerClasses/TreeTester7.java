package testerClasses;

import labUtils.Utils;
import treeClasses.LinkedBinaryTree;
import treeClasses.LinkedTree;

public class TreeTester7 {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		//Exercise 7
		LinkedTree<Integer> tree1 = new LinkedTree<>();
		
		LinkedTree<Integer> tree1Clone = tree1.clone();
		
		Utils.displayTree("Original", tree1);
		Utils.displayTree("Clone", tree1Clone);
		
		tree1 = Utils.buildExampleTreeAsLinkedTree();
		tree1Clone = tree1.clone();
		
		Utils.displayTree("Original", tree1);
		Utils.displayTree("Clone", tree1Clone);
		
		
		//Exercise 8
		LinkedBinaryTree<Integer> bTree = new LinkedBinaryTree<>();
		
		LinkedBinaryTree<Integer> bTreeClone = bTree.clone();
		
		Utils.displayTree("Original", bTree);
		Utils.displayTree("Clone", bTreeClone);
		
		bTree = Utils.buildExampleTreeAsLinkedBinaryTree();
		
		bTreeClone = bTree.clone();
		
		Utils.displayTree("Original", bTree);
		Utils.displayTree("Clone", bTreeClone);
	}

}
