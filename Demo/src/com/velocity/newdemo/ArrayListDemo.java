package com.velocity.newdemo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayListDemo {
	public static void main(String[] args) {
		int n=2;
		ArrayList<Integer> i = new ArrayList<Integer>();
		i.add(1);
		i.add(2);
		i.add(3);
		i.add(4);
		i.add(5);
		i.add(6);
		i.add(7);
		i.add(8);
		i.add(9);
		i.add(10);
		List<Integer> tableOfN = i.stream().map(x-> x*n).collect(Collectors.toList());
		for(int t:tableOfN)System.out.println(t);
	}
}
