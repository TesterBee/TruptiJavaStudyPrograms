package day1;

public class ExampleString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String x="Trupti Thakur";
		
		System.out.println("Hello  "+x);
		System.out.println(x.toUpperCase());
		System.out.println(x.substring(2));
		// it print from third char // array starts with zero
		System.out.println(x.substring(2,7)); 
		// it will start printing from 2 upto 7 but not including 7 .
		String age="37";
		String Salary="78956.32";
		
		//There are 8 primitive data type
		
		//byte  8 bit
		//short 16 bit
		//int 32 bit
		//Long 64 bit
		//float 32 bit --for decimal value
		//Double 64 bit for decimal value
		//Boolean for holding True / False
		//char  a6bit
		//String is not a primitive data type but use it to hold as charater value.
int a = Integer.parseInt(age)/2;
System.out.println(a);
Double sal=Double.parseDouble(Salary)*15;
System.out.println(sal);
		
	}

}
