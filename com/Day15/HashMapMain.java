package com.Day15;

/**
 * Main method to implement the methods of the hashTable
 *
 */

public class HashMapMain {
	/**
	 * main method to implement the methods
	 * Here we have passed the string and saved it in array of words by converting it into lower case and splitting
	 * Then we have used a loop to check for every words in the list
	 * Then we have called the hashMap get method and passed the word as key to it.
	 * The get method will check and return a value. We will increment the value then
	 * Then we add the key and value in the Hashmap
	 */
	
	public static void main(String[] args) {
		
		String string = "Paranoids are not paranoid because they are paranoid but because they keep putting themselves deliberately into paranoid avoidable situations";
		String[] words = string.toLowerCase().split(" ");
		
		HashMap<String, Integer> hashMap = new HashMap<>();
		
		for (int i = 0; i < words.length; i++) {

			String word = words[i];
			Integer value = hashMap.get(word);
			if (value == null) {
				value = 1;
			} else {
				value += 1;
			}
			hashMap.add(word, value);
		}
		hashMap.remove("avoidable");
		System.out.println(hashMap);
		
		
	}
		
}