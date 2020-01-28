package org.ter;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Array {
	public static void main(String[] args) {
		int a[]= new int[8];
		 
		a[0]=10;
		a[1]=10;
		a[2]=20;
		a[3]=50;
		a[4]=60;
		a[5]=80;
		a[6]=60;
		a[7]=50;
		List <Integer> li = new LinkedList<>();
	
	for (int i = 0; i < a.length; i++) {
		System.out.println(a[i]);
	
	
	li.add(a[i]);
	System.out.println(a[i]);}
	Set<Integer> si = new LinkedHashSet<>();
	si.addAll(li);
	System.out.println(si);
	
	
	
	}
	
	
	
	
	
	
	
	
	}



