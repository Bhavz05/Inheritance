package sample2;

public class String1 {

	public static void main(String[] args) {
		String s = "hello";
		String n = new String ("java program");
		System.out.println(s);
		System.out.println(n);
		
		//concat==> Add two strings 
		System.out.println(s.concat(n));
		//length ==>To identify the size of string
		System.out.println(s.length());
		//contains==>to check whether character is present in the string 
		String s1="how are you";
		System.out.println(s1.contains(n));
	

	}

}
