package Lecture23;

import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        HashMap<String, Integer> map=new HashMap<>();
        
        map.put("India",300);
        map.put("Russia", 200);
        map.put("USA", 100);
        System.out.println(map);
        
        map.put("India", 325);
        System.out.println(map);
        
        System.out.println(map.get("India"));
        System.out.println(map.get("Finland"));
        
        System.out.println(map.remove("USA"));
        System.out.println(map);
	}
	
	

}
