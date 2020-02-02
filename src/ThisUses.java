
public class ThisUses {
	
	int a ;
	int b;
	
	ThisUses(int a,int b){
		this.a=a;
		this.b=b;
	}
	
	
	public static void main(String[] args) {
		
		
		ThisUses abc = new ThisUses(4,5);
		
		System.out.println(abc.a);
		
		System.out.println(abc.b);
		
	
		
		
	}
	
	public ThisUses getclass(){
		
		return this;
	}

}
