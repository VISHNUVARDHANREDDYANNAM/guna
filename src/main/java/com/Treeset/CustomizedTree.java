package com.Treeset;

import java.util.Comparator;
import java.util.TreeSet;

public class CustomizedTree {
public static void main(String[] args) {
	TreeSet<String> treeSet = new TreeSet<>(new Customize());
	treeSet.add("bablu");
	treeSet.add("chitti");
	treeSet.add("chinna");
	treeSet.add("laddu");
	treeSet.add("ash");
	System.out.println(treeSet);
	
}

}
class Customize implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		
		return 0;
	}
}