package day1;

public class ExampleSingleDimentionalArray {

	public static void main(String[] args) {
		
		int []abc= {10,20,30,40,50}; // declaration and assigning value to the array.
		//Array starts with 0...
		System.out.println(abc[2]+"  "+abc[4]);//printing array 2nd and fourth value.
		
		// print all value of array we use for loop or enhanced for 
		//enhanced for
		for(int temp:abc){ // array will stored in temp variable
			System.out.println(temp);
		}
		
		int[] a=new int[5]; 
		// declare array ..meANS THIS A has 5 value,immediately java will create five boxes.
		//if we did not assigning value then by default 
		//it will take zero for int and Null for string data type.
		for(int temp2:a){ // array will stored in temp variable
			System.out.println(temp2);
			a[3]=15;
			a[4]=16;
			
		}
		
		

	}

}
