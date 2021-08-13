package com.Techment.Assignment2;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;


public class Question3
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter run scored :");
		
		
		HashMap m=new HashMap();
		int sum=0;
		
		m.put("Rahane",20);
		m.put("Rahul",30);
		m.put("Kohli",150);
		m.put("Dhoni",50);
		m.put("Lokesh",2);

		
		Set s1=m.entrySet();
		System.out.println(s1);
		System.out.println("\n");
		;
		System.out.println("===player who batted===");
		Set s=m.keySet();
	
		System.out.println(s);
		System.out.println("\n");
		
		Iterator itr=s1.iterator();
		System.out.println("===Scores by player===");
		while(itr.hasNext())
		{
			Map.Entry m1=(Map.Entry)itr.next();
			
			System.out.println(m1.getKey()+" : "+m1.getValue());
		

	    }		//System.out.println(m);
		System.out.println("\n");
		
		for(Object mapElement : m.entrySet())
	   {
			Collection c=m.values();
			int value = (int)mapElement.getValue();
			sum=sum+value;
	
	    }
		System.out.println("===Total sum===");
		System.out.println("Total sum :"+sum);
		System.out.println("\n");
		
	//	System.out.println("===name of the highest scorer===");
	//	System.out.println("name of the highest scorer : "+m.get("150"));
		System.out.println("===run scored by dhoni ===");
		System.out.println("run scored by dhoni : "+m.get("Dhoni"));
	}
	
}
