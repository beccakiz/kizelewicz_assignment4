
public class Decrypter {

	public static void decrypt(int one, int two, int three, int four) {

		int temp = one;
		one = three;
		three = temp;
		
		int temp1 = two;
		two = four;
		four = temp1;
		
		if(one <= 6) {
			one += 10;
		}		
		if(two <= 6) {
			two += 10;
		}	
		if(three <= 6) {
			three += 10;
		}	
		if(four <= 6) {
			four += 10;
		}	
		one -= 7;
		two -= 7;
		three -= 7;
		four -= 7;
		
		System.out.printf("" + one + two + three + four);
		
	}
}
