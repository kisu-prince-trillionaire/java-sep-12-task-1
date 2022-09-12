package com.collectiondemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionMain {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		list.add("Dog");
		list.add("Cat");
		list.add("Lion");
		list.add("Tiger");
		list.add("Cow");
		System.out.println("Display using simple for loop");
		for(int i = 0;i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("Display using Advanced for loop");
		for(String name:list) {
			System.out.println(name);
		}
		System.out.println(" Display using Iterator");
		Iterator<String> iterator = list.iterator();
		while(iterator.hasNext()) {
			String name = iterator.next();
			System.out.println(name);
		}
	
	}

}
