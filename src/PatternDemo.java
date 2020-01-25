
public class PatternDemo {

	public static void main(String[] args) {


		
		for(int i=5;i>1;i--){
			
			for(int j=0;j<(i-2);j++){
				System.out.print(" ");
			}
			for(int k=0;k<6-i;k++){
				System.out.print("*");
			}
			
			System.out.println();
			
		}
		
		

	}

}
