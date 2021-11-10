package org.collections;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.remote.server.handler.html5.RemoveLocalStorageItem;

public class CollectionsList {
	
	public static void main(String[] args) {
		
		//list will support dissimilar data types
		//Array list
		List li =  new ArrayList();
		li.add(10);
		li.add("java");
		li.add(8438329101l);
		li.add(12244.23f);
		li.add('m');
		li.add(true);
		
		System.out.println(li);
		
		//generics
		List<Integer> li1 = new ArrayList<Integer>();
		li1.add(10);
		li1.add(20);
		li1.add(30);
		li1.add(40);
		li1.add(50);
		li1.add(50);
		
		System.out.println(li1);//prints in insertion order [10, 20, 30, 40, 50, 50]
		System.out.println("list will allow duplicate values");
		
		//to print the size of the array
		int size = li1.size();
		System.out.println("size of arraylist:"+ size);
		
		//to get the particular value
		int indexvalue = li1.get(4);
		System.out.println("index value of[4]:"+ indexvalue);
		
		//to print all the values in vertical or sequential order
		//for loop
		System.out.println("array using for loop");
		for (int i = 0; i < li1.size(); i++) {	
			System.out.println(li1.get(i));
		}
		
		//enhanced for loop
		System.out.println("array using for each loop");
		for (Integer integer : li1) {
			System.out.println(integer);	
		}
		
		//value removed without changing changing index after value removed
		System.out.println("removing particular value from li1");
		li1.remove(2);
		System.out.println(li1);
		
		//index based add
		System.out.println("adding value index based");
		li1.add(2, 30);
		System.out.println(li1);
		System.out.println("values moving backward after adding value in btw");
		li1.add(3, 100);
		System.out.println(li1);
		
		//set method is used to replace the value in particular index
		System.out.println("after replacing particular value by passing index");
		li1.set(2, 200);
		System.out.println(li1);
		
		//contains method is used to check the particular value in the li1
		System.out.println("contains method checked the particular value in the li1");
		boolean contains = li1.contains(300);
		System.out.println("value 300 in li1:"+ contains);
		
		//clear method is used to clear all the index in the li1
		System.out.println("clear method cleared all the index in the li1");
		li1.clear();
		System.out.println(li1);
		
	}
		
				
		
	}

