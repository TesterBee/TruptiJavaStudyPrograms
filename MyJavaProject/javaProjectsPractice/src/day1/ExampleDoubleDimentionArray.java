package day1;

public class ExampleDoubleDimentionArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [][] PQR=new int[4][3];
		
		int temp=10;
		
		for(int i=0;i<4;i++) {
			for (int j=0;j<3;j++) {
				
				PQR[i][j]=temp;
				temp+=10;
				System.out.print("   "+ PQR[i][j] );
			}
			
			System.out.println();
		}
	
		
		

	}

}
