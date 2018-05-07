package day1.Exercise;

public class ExerciseB {
	
	static int length=10;
	static int  width=20;

	public static void main(String[] args) {
		
		ExerciseB xyz=new ExerciseB();
	ExerciseB.length =20;
	ExerciseB.width=40;

		xyz.Box();
	}
	
	public  void Box() {
		
		
		
		int totalArea=(length*width);
		
		System.out.println("Total Area of the Box=  "+totalArea);
		
		
		
	}

}
