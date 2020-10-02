package com.bridgelabz.colectionsjava;

import java.util.*;

public class CollectionDemo {
	public static void main(String[] args) {
		doListDemo();
		doStackDemo();
		doQueueDemo();
		doSetDemo();
		doMapDemo();	
	}
	
	public static void doListDemo() {
		System.out.println("In doListDemo");
		List<String> list=new ArrayList<>();
		list.add("John");
		list.add("Ralph");
		list.add("Downer");
		list.add("Ralph");
		Iterator itr=list.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
	}
	
	public static void doStackDemo() {
		System.out.println("\nIn doStackDemo");
		Stack<String> stack=new Stack<>();
		stack.add("John");
		stack.add("Ralph");
		stack.add("Downer");
		stack.add("Ralph");
		stack.add("Vinay");
		stack.pop(); //LIFO
		Iterator itr=stack.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
	}
	
	public static void doQueueDemo() {
		System.out.println("\nIn doQueueDemo");
		PriorityQueue<String> queue=new PriorityQueue<>();
		queue.add("John Bolt");
		queue.add("Ralph Brown");
		queue.add("Downer Migh");
		queue.add("Ralph Brown");
		queue.add("Vinay Ved");
		System.out.println("Head: "+queue.element());
		System.out.println("Head: "+queue.peek());
		System.out.println("Iterating queue elements");
		Iterator itr=queue.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		queue.remove();
		queue.poll();
		System.out.println("Fter removing two elements");
		Iterator itr1=queue.iterator();
		while(itr1.hasNext())
			System.out.println(itr1.next());
	}
	
	public static void doSetDemo() {
		System.out.println("\nIn doSetDemo");
		Set<String> set=new LinkedHashSet<>();
		set.add("John");
		set.add("Ralph");
		set.add("Downer");
		set.add("Ralph");
		//Duplicate Values not allowed
		Iterator itr=set.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
	}
	
	public static void doMapDemo() {
		System.out.println("\nIn doMapDemo");
		Map<Integer,String> map=new HashMap<>();
		map.put(101, "John");
		map.put(102, "Ralph");
		map.put(103, "Downer");
		map.put(104, "Ralph");
		//Duplicate Keys not allowed
		for(Map.Entry<Integer, String> m:map.entrySet())
			System.out.println(m.getKey()+" "+m.getValue());
	}

}
