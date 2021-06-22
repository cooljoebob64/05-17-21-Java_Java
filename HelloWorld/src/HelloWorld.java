import java.util.Scanner;


public class HelloWorld {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		
		Scanner input = new Scanner(System.in);
		System.out.println("What is your name?");
		String firstName = input.nextLine();
		System.out.println("Hello, " + firstName + "!");
		System.out.printf(firstName, args);
	}
}
