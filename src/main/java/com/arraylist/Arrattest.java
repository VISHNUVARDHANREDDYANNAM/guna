package com.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class Arrattest {
	public static void main(String[] args) {
		// creating user defined class objects
		Student student = new Student(1, "vishnu", 22);
		Student student1 = new Student(2, "vis", 23);
		Student student2 = new Student(3, "vish", 21);
		Student student3 = new Student(4, "vishn", 20);
		// creating array
		ArrayList<Student> arrayList = new ArrayList<Student>();
		// adding student class object
		arrayList.add(student);
		arrayList.add(student1);
		arrayList.add(student2);
		arrayList.add(student3);
		// getting iterartor
		Iterator<Student> iterator = arrayList.iterator();
		// traversing elements of arraylist object
		while (iterator.hasNext()) {
			Student next = (Student) iterator.next();
			System.out.println(next.name + "--" + next.age + "--" + next.rollno);
			/*
			 * for (Student student4 : arrayList) { System.out.println(next);
			 */

		}
		}
//implementing addall method
		static class Testcollection {
			public static void main(String[] args) {
				ArrayList<String> arrayList1 = new ArrayList<String>();
		arrayList1.add("vishnu");
		arrayList1.add("vivek");
		arrayList1.add("shiva");
		arrayList1.add("gova");
		ArrayList<String> arrayList2 = new ArrayList<String>();
arrayList2.add("sai");
arrayList2.add("prasad");
	arrayList1.addAll(arrayList2);//adding secondlist in firstlist
//traversing by using for each loop  
	for (String student5 : arrayList1) {
				System.out.println(student5);
				
			}
			}
			
		}
	}
// removig all() method
class test{
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		 al.add("Ravi");  
		  al.add("Vijay");  
		  al.add("Ajay");  
		  ArrayList<String> al2=new ArrayList<String>();  
		  al2.add("Ravi");  
		  al2.add("Hanumat");  
		  al.removeAll(al2);  
		  System.out.println("iterating the elements after removing the elements of al2...");  
		  //by using itertaor
		  Iterator itr=al.iterator();  
		  while(itr.hasNext()){  
		   System.out.println(itr.next());  
		  }  
		  
		  }
	
	}





