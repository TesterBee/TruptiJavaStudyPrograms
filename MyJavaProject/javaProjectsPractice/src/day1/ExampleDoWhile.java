package day1;

public class ExampleDoWhile {

	public static void main(String[] args) {
	// difference bet do and while 
		// in Do loop  statement will run atleast once , 
		//and then will check condition
		//In while loop condition will check first and then statement
	int x=10;
	do {
		
		System.out.println("x   ="+x);
		x--;
	}while(x>=0);
	
	int Y=10;
	do {
		
		System.out.println("Y   ="+Y);
		Y--;
	}while(Y<=0);
	
	
	}
}

