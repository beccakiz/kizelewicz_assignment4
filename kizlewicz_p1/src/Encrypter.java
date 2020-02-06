
public class Encrypter {
		
	public static int encrypt(int one, int two, int three, int four) {
		
		one += 7;
		two += 7;
		three += 7;
		four += 7;
		
		one = one % 10;
		two = two % 10;
		three = three % 10;
		four = four % 10;
		
		int temp = one;
		one = three;
		three = temp;
		
		int temp1 = two;
		two = four;
		four = temp1;
		
		System.out.println("" + one + two + three + four);
		
		int num =  (one * 1000) + (two * 100) + (three * 10) + (four * 1);
		return num;
		
		// I was going to use strings to deal with the zero but I realized I could save 
		// the digits into their own integers
	/*	public static void encrypt(String input) {
		String array[] = new String[4];
		
		for(int i = 0; i < input.length(); i++) {
			
			array[i] = input.substring(i, i+1); 
		}
		
		int array2[] = new int[4];
		
		for(int i = 0; i < array.length; i++) {
			
			array2[i] = Integer.parseInt(array[i]) ;
			array2[i] += 7;
			array2[i] = array2[i] % 10;
		}
		
		int temp = array2[0];
		temp = array2[0];
		array2[0] = array2[2];
		array2[2] = temp;
		int temp1 = array2[1];
		array2[1] = array2[3];
		array2[3] = temp1;
		
		for(int i = 0; i < array2.length; i++) {
			System.out.print(array2[i]);
		}
		*/
	}
}
