package com.linkedlist.test;

public class MainTester {

	public static void main(String[] args) {
		
		LinkedList list = new LinkedList();
		list.insert(5);
		list.insert(2);
		list.insert(44);
		list.insert(6);
		list.insert(11);
		list.insertAt(2, 33);
		list.insertAtStart(3);
		list.deleteAt(2);
		list.insertAt(0, 22);
		System.out.println("------------------");
		list.searchInList(11);
		System.out.println("------------------");
		list.show();
		System.out.println("\n------------------");
		list.reverseTheList();
		
	}

}
