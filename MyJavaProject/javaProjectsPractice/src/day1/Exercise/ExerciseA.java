package day1.Exercise;

public class ExerciseA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double Sal=50000;
		double tax= 0.0;
		
		if(Sal<=15000) {
			
			tax=(Sal)*.10;
			System.out.println(tax);
				
		}else if(Sal>15000 && Sal<=40000) {
			
			tax=(Sal)*.15;
			System.out.println(tax);
		
		
		}
		else {
		
		tax=(Sal)*.30;
		System.out.println(tax);
		}
	}

}
