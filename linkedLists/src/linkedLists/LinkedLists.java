package linkedLists;

import java.util.Arrays;
import java.util.LinkedList;

public class LinkedLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<String> list = new LinkedList<String>();
		
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("E");
		list.add("F");
		
		System.out.println(list);
		System.out.println(list.size());
		
		list.remove("B");
		list.remove(3);
		list.removeFirst();
		list.removeLast();
		System.out.println(list);
		list.removeAll(list);
		
		list.add("Coding");
		list.add("is");
		list.add("fun");
		System.out.println(list);
		
		list.add(1, "java");
		System.out.println(list);
		
		list.add(1, "Pyhthon");
		System.out.println(list);
		
		Object[] arr = list.toArray();
		System.out.println(Arrays.toString(arr));
		
	}

}
