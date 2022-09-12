package com.collectiondemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListCollection {

	public static void main(String[] args) {
		List<String> list = new LinkedList<String>();
		System.out.println("List of Country Names are --------------");
		list.add("India");
		list.add("Nepal");
		list.add("Bhutan");
		list.add("China");
		list.add("Australlia");
		list.add("Hong Kong");
		list.add("Thailand");
		
		System.out.println("Content of Linked List are-------------------");
		Iterator<String> iterator = list.iterator();
		while(iterator.hasNext()) {
			String name = iterator.next();
			System.out.println(name);
		}
		
		List<String> list2 = new ArrayList<String>();
		System.out.println("List of Country Names are --------------");
		list2.add("India");
		list2.add("Nepal");
		list2.add("Bhutan");
		list2.add("China");
		list2.add("Australlia");
		list2.add("Hong Kong");
		list2.add("Thailand");
		
		System.out.println("Content of Array List are-------------------");
		Iterator<String> iterator2 = list2.iterator();
		while(iterator2.hasNext()) {
			String name = iterator2.next();
			System.out.println(name);
		}

	}

}
