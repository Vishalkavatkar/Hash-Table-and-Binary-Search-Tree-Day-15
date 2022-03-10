package com.Day15BST;

/**
 * We have created this class to implement the methods of the binary tree
 * Method insert to add data to BST
 * Method insertAll to insert the node to the tree
 * Method display to display the BST
 * Method inorder to display the BST inorder. In inorder we display first left then data and then the right child.
 * Method preorder to display the BST. In preorder we display root and then left child and then the right child.
 * Method postorder to display the BST. In postorder we display left child and then right and then the root node.
 *
 */
public class BinaryTreeService {
Node root;
	
    /**
     * Method insert to add data to BST
     * First we create a newNode for the data
     * Then we call the insertAll method
     * Then we call the display method to print the BST
     * @param data - We are passing the data to insert
     */
	public void insert(int data) {
		
		Node newNode = new Node(data);
		this.root = insertAll(root, newNode);
		display(this.root);
		System.out.println();
	}

	/**
	 * Method insertAll to insert the node to the tree
	 * First we check if the root is null. If null then we return the node
	 * If the node is less that the root then the node will be entered to the left 
	 * If the node is greater that the root then the node will be entered to the right
	 * After inserting we will return the node 
	 * @param root - Here we pass the root node
	 * @param node - Here we pass the node to insert
	 * @return -  We get the node output with implemented BST
	 */
	public Node insertAll(Node root, Node node) {
		
		if (root == null) 
			return node;
		else if(root.compareTo(node) > 0) {
			System.out.print(" inserted " + node.data + " in the left \n");
			root.left = insertAll(root.left, node);
		}
		
		else if(root.compareTo(node) < 0) {
			System.out.print(" inserted " + node.data + " in the right \n");
			root.right = insertAll(root.right, node);
		}
		
		return root;
	}
	
	/**
	 * Method display to display the BST
	 * If root is null then we will return
	 * Else we will display the left and then root and then the right child.
	 * @param root -  we pass the root to display the BST
	 */
	public void display(Node root) {
		if(root == null)
			return;
		
		display(root.left);
		System.out.print(" " + root.data);
		display(root.right);
	}
	
	/**
	 * Method inorder to display the BST inorder. In inorder we display first left then data and then the right child.
	 * We pass the node and then call the method inorder and check left or right
	 */
	public void inorder()
    {
        inorder(root);
    }
    private void inorder(Node r)
    {
        if (r != null)
        {
            inorder(r.left);
            System.out.print(r.data +" ");
            inorder(r.right);
        }
    }
    /* Function for preorder traversal */
    /**
	 * Method preorder to display the BST. In preorder we display root and then left child and then the right child.
	 * We pass the node and then call the method preorder and check left or right
	 */
    public void preorder()
    {
        preorder(root);
    }
    private void preorder(Node r)
    {
        if (r != null)
        {
            System.out.print(r.data +" ");
            preorder(r.left);             
            preorder(r.right);
        }
    }
    /* Function for postorder traversal */
    /**
	 * Method postorder to display the BST. In postorder we display left child and then right and then the root node.
	 * We pass the node and then call the method postorder and check left or right
	 */
    public void postorder()
    {
        postorder(root);
    }
    private void postorder(Node r)
    {
        if (r != null)
        {
            postorder(r.left);             
            postorder(r.right);
            System.out.print(r.data +" ");
        }
    }   
    
    /**
     * Method size to check the size of the BST
     * If root is null then the BST is empty and will return 0
     * We add the right and the left child and the root
     */
    public void size() {
		System.out.println("\nThe size of the tree is: " + sizeAll(root));
	}
	
	public int sizeAll(Node root) {
		
		if (root == null)
			return 0;
		
		return sizeAll(root.left) + sizeAll(root.right) + 1;
	}
}