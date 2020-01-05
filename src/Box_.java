
public class Box_ {
	
	final int l=10;
	static int b=20;
	int h=30;
	
	public static void main(String[] args) {
		
		Box_ smallBox = new Box_();
		
		System.out.println(smallBox.l);
		System.out.println(smallBox.b++);
		System.out.println(smallBox.h++);
		
		System.out.println("=====================================================");
		
       Box_ middleBox = new Box_();
		
		System.out.println(middleBox.l);
		System.out.println(middleBox.b++);
		System.out.println(middleBox.h);
		
		System.out.println("=====================================================");
		
	       Box_ bigBox = new Box_();
			
			System.out.println(bigBox.l);
			System.out.println(bigBox.b++);
			System.out.println(bigBox.h);
		
		
		
	}

}
