import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter 4 digits: ");
		
		int in = scan.nextInt();
		//saving each digit into their own integer
		int first = in / 1000 % 10;
		int second = in / 100 % 10;
		int third = in / 10 % 10;
		int fourth = in / 1 % 10;
		scan.close();
		
		System.out.println("Your Encrypted number is: ");
		int num = Encrypter.encrypt(first, second, third, fourth);
		int one = num / 1000 % 10;
		int two = num / 100 % 10;
		int three = num / 10 % 10;
		int four = num / 1 % 10;
		
		System.out.println("Your Decrypted number is: ");
		Decrypter.decrypt(one, two, three, four);
		
	}
}
