package labUtils;

import treeClasses.LinkedBinaryTree;
import treeClasses.LinkedTree;
import treeInterfaces.Position;
import treeInterfaces.Tree;

public class Utils {
	public static <E> void displayTree(String msg, Tree<E> t) { 
		System.out.println("\n\n" + msg); 
		t.display(); 
	}

	public static <E> void displayTreeElements(String msg, Tree<E> t) {
		System.out.println("\n\n" + msg); 
		for (E element : t)
			System.out.println(element); 
		
	}
	
	public static LinkedTree<Integer> buildExampleTreeAsLinkedTree() { 
		LinkedTree<Integer> t = new LinkedTree<>(); 
		// ADD CODE AS SPECIFIED IN EXERCISE 2
		
		Position<Integer> root = t.addRoot(4);
		
		Position<Integer> chRoot1 = t.addChild(root, 9);
		Position<Integer> chRoot2 = t.addChild(root, 20);
		
		Position<Integer> chRoot11 = t.addChild(chRoot1, 7);
		Position<Integer> chRoot12 = t.addChild(chRoot1, 10);
		
		Position<Integer> chRoot21 = t.addChild(chRoot2, 15);
		Position<Integer> chRoot22 = t.addChild(chRoot2, 21);
		
		Position<Integer> chRoot211 = t.addChild(chRoot21, 12);
		Position<Integer> chRoot212 = t.addChild(chRoot21, 17);
		
		Position<Integer> chRoot2121 = t.addChild(chRoot212, 19);
		
		Position<Integer> chRoot221 = t.addChild(chRoot22, 40);
		
		Position<Integer> chRoot2211 = t.addChild(chRoot221, 30);
		Position<Integer> chRoot2212 = t.addChild(chRoot221, 45);
		
		
		return t; 
	}
	
	public static LinkedBinaryTree<Integer> buildExampleTreeAsLinkedBinaryTree() { 
		LinkedBinaryTree<Integer> t = new LinkedBinaryTree<>(); 
		// ADD CODE AS SPECIFIED IN EXERCISE 2
		Position<Integer> root = t.addRoot(4);
		
		Position<Integer> chRoot1 = t.addLeft(root, 9);
		Position<Integer> chRoot2 = t.addRight(root, 20);
		
		Position<Integer> chRoot11 = t.addLeft(chRoot1, 7);
		Position<Integer> chRoot12 = t.addRight(chRoot1, 10);
		
		Position<Integer> chRoot21 = t.addLeft(chRoot2, 15);
		Position<Integer> chRoot22 = t.addRight(chRoot2, 21);
		
		Position<Integer> chRoot211 = t.addLeft(chRoot21, 12);
		Position<Integer> chRoot212 = t.addRight(chRoot21, 17);
		
		Position<Integer> chRoot2121 = t.addLeft(chRoot212, 19);
		
		Position<Integer> chRoot221 = t.addLeft(chRoot22, 40);
		
		Position<Integer> chRoot2211 = t.addLeft(chRoot221, 30);
		Position<Integer> chRoot2212 = t.addRight(chRoot221, 45);
		
		return t; 
	}


}
