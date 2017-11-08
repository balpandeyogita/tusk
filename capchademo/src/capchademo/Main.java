package capchademo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Main {
	
	// my changes

	public static void main(String[] args) {
		int [] intArray={1,2,3,2};            //2 is duplicate
		removeDuplicate(intArray);	
		
		/*String a="hi";
		String abc=123+5+"hi"+"hi"+12+13;
		System.out.println(abc);*/
			
		    String a = "a";
		    String b = "b";
		    String c = "c";
		    String result = a + b + c;
	}

	private static void removeDuplicate(int[] arr) {
		List<Integer> list=new ArrayList<>();
		for (int i : arr) {
			list.add(i);
	}
		
		Set<Integer> set=new LinkedHashSet<>(list);
		for (Integer integer : set) {
			System.out.println(integer + " ");
		}
		
		
	}
		
		
	
}
