package com.linkedlist.test;

import java.util.Objects;

public class Node {
	
	private int data;
	private Node next;
	
	public int getData() {
		return data;
	}
	
	public void setData(int data) {
		this.data = data;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node node) {
		this.next = node;
	}

	@Override
	public int hashCode() {
		return Objects.hash(data, next);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Node other = (Node) obj;
		return data == other.data && Objects.equals(next, other.next);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Node [data=");
		builder.append(data);
		builder.append(", next=");
		builder.append(next);
		builder.append("]");
		return builder.toString();
	}
}
