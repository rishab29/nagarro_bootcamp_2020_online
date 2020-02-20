package Lecture10;

public class StrinngBuilderDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb=new StringBuilder("Hello");
//		sb.append('c');
//		System.out.println(sb.toString());
//		System.out.println(sb.length());
//		
//		sb.append("Hello");
//		System.out.println(sb);
//		
		System.out.println(sb);
		sb.append('y');
		
		System.out.println(sb);
		sb.setCharAt(2, 'i');
		System.out.println(sb);
		
	}

}
