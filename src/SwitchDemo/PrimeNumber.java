package SwitchDemo;

public class PrimeNumber {
	
	
	public static void main(String[] args) {

		int a = 91;

		int i;
		for (i = 2; i < a; i++) {

			if (a == 2) {
				System.out.println("Prime");
				break;
			}
			if (a % i == 0) {
				System.out.println("Not Prime");
				break;

			}
		}
		if (i == a) {
			System.out.println("Its Prime");

		}

	}
}
