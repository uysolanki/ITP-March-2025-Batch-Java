package day1;

import java.util.LinkedList;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		List a1=new LinkedList();   //ctrl shift 0
		System.out.println(a1.size());
		
		for(int i=1;i<=10;i++)
			a1.add("Apple");
		
		System.out.println(a1.size());  //size=10, capacity=10
		  a1.add("Apple");
		
		 // a1.get(11);
	}

}
