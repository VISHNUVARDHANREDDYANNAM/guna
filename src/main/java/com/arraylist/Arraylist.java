package com.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylist {
private static char[] string;

public static void main(String[] args) {
	ArrayList<Integer> arraylist = new ArrayList<Integer>();
arraylist.add(1);
arraylist.add(2);
arraylist.add(3);
arraylist.add(4);
System.out.println(arraylist);
ArrayList<String> arraylist1 = new ArrayList<String>();
arraylist1.add("vishnu");
arraylist1.add("gova");
arraylist1.add("akhil");
arraylist1.add("nikhil");
//traversing throudh iterator

Iterator<String> iterator = arraylist1.iterator();
while(iterator.hasNext()){
System.out.println(iterator.next());	
}

//traversing through foreachloop
/*for (String string : arraylist1) {
	
	System.out.println(string);
}
*/
}

}
