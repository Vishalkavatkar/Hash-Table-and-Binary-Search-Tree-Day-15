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
		ab.insert(22);
		ab.insert(40);
		ab.insert(60);
		ab.insert(95);
		ab.insert(11);
		ab.insert(65);
		ab.insert(3);
		ab.insert(16);
		ab.insert(63);
		ab.insert(67);
		
		System.out.print("\nBinary Search Tree ");
        System.out.print("\nPost order : ");
        ab.postorder();
        System.out.print("\nPre order : ");
        ab.preorder();
        System.out.print("\nIn order : ");
        ab.inorder();
        
        ab.size();
		
		
	}

}