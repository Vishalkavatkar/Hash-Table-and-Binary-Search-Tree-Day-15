package com.Day15BST;

import java.util.Scanner;
/**
 * Main method to implement the methods.
 *
 */
public class BinaryTreeMain {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BinaryTreeService ab = new BinaryTreeService();
		
		ab.insert(56);
		ab.insert(30);
		ab.insert(70);
		
		System.out.print("\n Binary Search Tree ");
        System.out.print("\nPost order : ");
        ab.postorder();
        System.out.print("\nPre order : ");
        ab.preorder();
        System.out.print("\nIn order : ");
        ab.inorder();
		
	}

}