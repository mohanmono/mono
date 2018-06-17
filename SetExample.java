package com.util.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {
	public static void main(String args[]) {
		Set<String> set = new HashSet<String>();
		set.add("one");
		set.add("Two");
		set.add("one");
		System.out.println(set);
		List<String> list = new ArrayList<String>();
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("one");
		Set<String> setone =new HashSet<String>(list);
		System.out.println(setone);
		LinkedHashSet<String> linkedSet= new LinkedHashSet<String>();
		linkedSet.add("one");
		for(int i=0;i<=10;i++) {
			linkedSet.add("two"+i);
		}
		System.out.println(linkedSet);
		System.out.println(setone);
		TreeSet<String> treeSet =new TreeSet<String>();
		treeSet.add("one");
		treeSet.add("two");
		treeSet.add("three");
		treeSet.add("four");
		System.out.println(treeSet);
		NavigableSet<String> navigableSet= treeSet.headSet("three",true );
		System.out.println(navigableSet);
		NavigableSet<String> naviTailSet= treeSet.tailSet("three",true );
		System.out.println(naviTailSet);
		
		
		
		
		

				
	}

}
