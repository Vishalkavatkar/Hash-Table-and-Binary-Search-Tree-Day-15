package com.Day15;

/**
 *  We have created this generic class for the LinkedList implementation
 *  Method search to search for a specific key in the HashTable
 *  
 * @param <K> : We have used the generic type of key for the LinkedKist
 */

public class LinkedList<K> {

	//we have initialize 2 variable for generic type 
	private Node<K> head;
	private Node<K> tail;

	public Node<K> search(K key) {
		/**
		 * Method search to search for a specific key in the HashTable
		 * First we declare a variable of type node and assign it to head
		 * Then we travel in the list till it is not null
		 * While traversing we check if list key matches the input key
		 * If key found then we return the node
		 * If key not found then we return the null
		 * @param key -  here we are passing the key to search for a specific key in the LinkedList
		 * @return - once we find the key we return the node of that specific key
		 */
		Node<K> temp = head;
		while (temp != null) {
			if (temp.getKey().equals(key)) {
				return temp;
			}
			//incrementing the temp
			temp = temp.getNext();
		}
		return null;
	}

	
	public void append(Node<K> myNode) {
		/**
		 * First we check if the head and tail is null and then we assign the new node to it.
		 * If elements present then we add the element to the tail and make the newNode as tail
		 * @param myNode - Here we pass the node to append at last
		 */

		if (this.head == null) {
			this.head = myNode;
		}
		if (this.tail == null) {
			this.tail = myNode;
		} else {
			this.tail.setNext(myNode);
			this.tail = myNode;
		}
	}
	
	public boolean remove(K key) {
    	/**
    	 * Method remove to remove the node from the LinkedList
    	 * First we assign the head to temp and prev as null
    	 * Then we check if the temp key matches the imput key
    	 * We increment the temp and prev till we get the key
    	 * If we get the key match then we make the prev as temp and assign the temp next tp the prev i.e temp
    	 * @param key -  we pass the key to remove the node
    	 * @return - We return true if we find the node and found and deleted it and we return false
    	 */
		
		Node<K> temp =head;
		Node<K> prev = null;
		while(temp != null) {
			if(temp.getKey()==key) {
				prev.setNext(temp.getNext());
				return true;
			} 
			prev = temp;
			temp = temp.getNext();
		}
		return false;
	}

	@Override
	public String toString() {
		return "\n MyLinkedListNodes{" + head + "}";
	}
	

	public void printMyNodes() {
		System.out.println(" My Nodes :" + head);
	}
	
	
}
