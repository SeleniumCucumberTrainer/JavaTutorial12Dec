
public class Box {
	
	int l;
	
	int b;
	
	int h;
	
	Box(int x, int y, int z){
		
		l=x;
		b=y;
		h=z;
		
	}
	
	Box(){
		
	}
	
	
	
	public static void main(String[] args) {
		
	
		Box bigTifin = new Box(2,3,4);
		
		
		Box smalltifin = new Box();
		
		
		
		
		System.out.println(bigTifin.l);
		System.out.println(bigTifin.b);
		
		
		System.out.println(smalltifin.l);
		System.out.println(smalltifin.b);
		
		
	}
}
