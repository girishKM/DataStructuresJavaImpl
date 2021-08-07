/**
 * 
 */
package com.linkedlist.test;

/**
 * @author g i r i s h
 *
 */
public class LinkedList {

	Node head;
	
	public void insert(int data) {
		Node node = new Node();
		node.setData(data);
		node.setNext(null);
		
		if(head == null) {
			head = node;
		} else {
			Node temp = head;
			while (temp.getNext()!=null) {
				temp = temp.getNext();
			}
			temp.setNext(node);
		}
	}

	public void insertAtStart(int data) {
		Node node = new Node();
		node.setData(data);
		node.setNext(head);
		head = node;
	}
	
	public void insertAt(int pos, int data) {
		Node node = new Node();
		node.setData(data);
		if(pos == 0) {
			insertAtStart(data);
		}else {	
		Node temp = head;
		for (int i = 0; i < pos-1; i++) {
			temp = temp.getNext();
		}
		node.setNext(temp.getNext());
		temp.setNext(node);
		}
	}
	
	public void deleteAt(int pos) {
		if (pos == 0) {
			head = head.getNext();
		}
		else {
			Node temp = head;
			Node n1 = null;
			for (int i = 0; i < pos-1; i++) {
				temp = temp.getNext();
			}
			n1 = temp.getNext();
			temp.setNext(n1.getNext());
			System.out.println(n1.getData()+" deleted");
		}
		
	}
	
	public void searchInList(int data) {
		Node temp = head;
		var i = 0;
		while (temp.getNext()!=null) {
			i = i+1;
			temp = temp.getNext();
			if(temp.getData()==data) {
				System.out.println("element found in the list at position : "+i);
			}
		}
	}
	
	public void show() {
		Node temp = head;
		while (temp.getNext()!=null) {
			System.out.print("-> "+temp.getData());
			temp = temp.getNext();
		}
		System.out.print("->"+temp.getData());
	}
	
	public void reverseTheList() {
		Node current = head;
		Node prev = null;
		Node nextNode = null;
		if(head == null) {
			System.out.println("empty list");
		}
		while (current.getNext()!=null) {
			nextNode = current.getNext();
			current.setNext(prev);
			prev = current;
			current = nextNode;
		}
		System.out.print("-> "+current.getData());
		while (prev.getNext()!=null) {
			System.out.print("-> "+prev.getData());
			prev = prev.getNext();
		}
		System.out.print("-> "+prev.getData());
		
	}
}
