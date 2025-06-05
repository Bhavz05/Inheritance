package sample2;

public class Sample3 {

	public static void main(String[] args) {
		StringBuffer s1= new StringBuffer("hello");
		StringBuilder s2= new StringBuilder("javaprogramming");
		System.out.println(s1);
		System.out.println(s2);
		//Insert Method : used to insert particular element in index
		s1.insert(1, "r");
		System.out.println(s1);
		//Replace : used to replace element using index,Starting and ending position 
		s2.replace(1, 4, "u");

	}

}
