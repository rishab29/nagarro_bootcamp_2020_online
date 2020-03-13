package Lecture15;


//import lecture11.story1.Person;

public class PersonClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Part 1 - Default constructor, initialization process, ref type
		Person p1 = new Person();
		System.out.println(p1.age);
		System.out.println(p1.name);
		p1.age = 20;
		p1.name = "A";

		Person p2 = new Person();
		p2.age = 15;
		p2.name = "B";
//
		System.out.println(p1.age + ", " + p1.name);
		System.out.println(p2.age + ", " + p2.name);
		Test1(p1, p2);
		System.out.println(p1.age + ", " + p1.name);
		System.out.println(p2.age + ", " + p2.name);

		Person p = new Person(10, "Guddu");
		System.out.println(p.age);
		System.out.println(p.name);
	}

	public static void Test1(Person p1, Person p2) {
		Person temp =p1;
		p1=p2;
		p2=temp;
		
	}

	
		
}
