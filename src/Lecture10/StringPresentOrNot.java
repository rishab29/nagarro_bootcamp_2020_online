package Lecture10;

import java.util.ArrayList;

public class StringPresentOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         String str="Rishabh";
         
         ArrayList<String> list=new ArrayList<>();
         list.add("Hello");
         list.add("Bye");
         list.add("Coding Blocks");
         list.add("Rishab");
         list.add("good");
         
         for(int i=0;i<list.size();i++) {
        	 String s=list.get(i);
        	 if(s.equals(str)) {
        		 System.out.println("Found");
        		 return;
        	 }
         }
         
         System.out.println("Not Found");
	}

}
