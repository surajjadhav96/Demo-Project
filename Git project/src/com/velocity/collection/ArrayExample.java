package com.velocity.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayExample {

	public static void main(String[] args) {
ArrayList<String>al=new ArrayList<String>();
al.add("suraj");
al.add("ram");
al.add("shyam");
al.add("raj");

Iterator<String> itr = al.iterator();
while(itr.hasNext()) {
	System.out.println(itr.next());
}
	}

}
