package com.Day15;

/**
 * Node Interface with Key and next
 *
 * @param <K> - We have created generic type of Key
 */
public interface Node<K> {

	K getKey();

	void setKey(K key);

	void setNext(Node<K> next);

	Node<K> getNext();

}