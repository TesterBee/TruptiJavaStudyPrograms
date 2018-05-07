package day1;

public class ExampleAndOR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x=-10;
		int y=10;
		
		// Difference between && and & ( double and single ampercent)
		// In && it will not check second condition if first one is not true.
		// in & it will check for second condition if  first one is not true
		
		
		
		
		if(x>0 && y>0) {
			
			System.out.println("Both nums are positive");
		}else if(x>0 || y>0){
			System.out.println("Atleast one num is +ve");
		}else {
			System.out.println("Both numbers are -ve");
		}
		

	}

}
