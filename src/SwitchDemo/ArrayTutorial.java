package SwitchDemo;

import java.util.Arrays;

public class ArrayTutorial {

	public static void main(String[] args) {


		int[] abc = {11,22,33,44,55,66}; //[44,22,33,11]
		
		System.out.println(Arrays.toString(abc));
		
		/*for(int i=abc.length-1;i>=0;i--){
			
			System.out.print(abc[i]+" ");
		}
		*/
		for(int i=0;i<abc.length/2;i++){
			
			int temp = abc[i]; //22
			
			abc[i]=abc[abc.length-1-i];// 33
			
			abc[abc.length-1-i]=temp; // 11
			
		}
		
		
		
		
		System.out.println(Arrays.toString(abc));
		
		

	}

}
