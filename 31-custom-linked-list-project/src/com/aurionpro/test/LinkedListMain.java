package com.aurionpro.test;

import com.aurionpro.model.CustomLinkedList;

public class LinkedListMain {
	public static void main(String[] args) {
		
		var ll = new CustomLinkedList();
		
		ll.insertFirst(50);
		ll.insertFirst(40);
		ll.insertFirst(30);
		ll.insertLast(60);
		ll.insertLast(70);
		ll.insert(10, 0);
		ll.insert(50, 5);
		
		System.out.println("\nDisplay Linked List");
		ll.display();
		
		System.out.println("\nDeleted First Item : "+ll.deleteFirst());
		
		System.out.println("\nDisplay Linked List");
		ll.display();
		
		System.out.println("\nDeleted Last Item : "+ll.deleteLast());
		
		System.out.println("\nDisplay Linked List");
		ll.display();
		
		System.out.println("\nDeleting item at 2nd position : "+ll.delete(2));
		
		System.out.println("\nDisplay Linked List");
		ll.display();

		
	}
}
