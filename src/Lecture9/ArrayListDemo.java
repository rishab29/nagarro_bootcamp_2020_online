package Lecture9;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       ArrayList<Integer> list=new ArrayList<>();
       
       ArrayList<ArrayList<Integer>> matrix=new ArrayList<>();
       System.out.println(list.size());
       System.out.println(list);
       
       list.add(10);
       System.out.println(list.size());
       System.out.println(list);
       
       list.add(20);
       System.out.println(list.size());
       System.out.println(list);
       
       list.add(30);
       System.out.println(list.size());
       System.out.println(list);
       
       list.add(40);
       System.out.println(list.size());
       System.out.println(list);
       
       list.add(50);
       System.out.println(list.size());
       System.out.println(list);
       
       System.out.println(list.get(2));
       list.set(2, 100);
       System.out.println(list);
       
       for(int i=0;i<list.size();i++) {
    	   System.out.println(list.get(i));
       }
       
       list.remove(2);
       System.out.println(list);
       
       System.out.println(list.contains(20));
       
       System.out.println(matrix);
       
       matrix.add(list);
       System.out.println(matrix);
       
	}

}
