package section2_3.main;

public class Tools {
	
	public static char option='A';
	public char alternative='a';
	
	/*
	public static void printOption() {
		System.out.println(option);
	}*/
	
	public static void display(String str) {
		
		System.out.println(str);
		
	}
	
	public static void display(Double num) {
		
		System.out.println(num);
		
	}
	
	public static void display(float num) {
		
		System.out.println(num);
		
	}
	
	public static Object sum(double num1,double num2) {
		Object result=num1+num2;
		
		
		System.out.println(result);
		
		return result;
	}
	
	
}
