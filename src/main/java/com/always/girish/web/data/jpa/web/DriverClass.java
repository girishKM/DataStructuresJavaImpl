/**
 * 
 */
package com.always.girish.web.data.jpa.web;

import com.always.girish.web.data.jpa.service.LinkedList;

/**
 * @author g i r i s h
 *
 */
public class DriverClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
