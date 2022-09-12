package com.collectiondemo;

import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class VectorMain {

	public static void main(String[] args) {
		List<String> list = new Vector<String>();
		
		list.add("India");
		list.add("Nepal");
		list.add("Bhutan");
		list.add("China");
		list.add("Australlia");
		list.add("Hong Kong");
		list.add("Thailand");
		
		System.out.println("Content of Vector are-------------------");
		Iterator<String> iterator = list.iterator();
		while(iterator.hasNext()) {
			String name = iterator.next();
			System.out.println(name);
		}
		
		System.out.println("The size of the vector is : " + list.size());
		System.out.println("The capacity of the vector is : " + ((Vector<String>) list).capacity());
		
		System.out.println("Adding elements at specified position : ");
		list.add(1,"USA");
		list.add(3,"UK");
		list.add(5,"UAE");
		list.add(7,"UN");
		
		System.out.println("Content of Vector after adding some element are-------------------");
		Iterator<String> iterator2 = list.iterator();
		while(iterator2.hasNext()) {
			String name = iterator2.next();
			System.out.println(name);
		}
		
		System.out.println("The size of the vector after adding some element is : " + list.size());
		System.out.println("The capacity of the vector after adding some element is : " + ((Vector<String>) list).capacity());

	}

}
