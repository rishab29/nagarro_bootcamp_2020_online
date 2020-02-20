package Lecture10;

public class RotateByK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String str="abcde";
        int k=2;
        
        StringBuilder sb=new StringBuilder();
        
        for(int j=k;j<str.length();j++) {
        	sb.append(str.charAt(j));
        }
        
        for(int i=0 ;i<k;i++) {
        	sb.append(str.charAt(i));
        }
        
        System.out.println(sb);
	}

}
