package com.Treeset;

import java.util.Comparator;
import java.util.TreeSet;

public class Treesetexample {
	public static void main(String[] args) {
		TreeSet<String> treeSet = new TreeSet<>(new OwnComparator());
		treeSet.add("sahara");
		treeSet.add("amazon");
		treeSet.add("nile");
		treeSet.add("kango");
System.out.println(treeSet);		
	}

}

class OwnComparator implements Comparator{
	


	@Override
	public int compare(Object o1, Object o2) {
String s1=o1.toString();
String s2=o2.toString();
return -s1.compareTo(s2);
	}
	
}
