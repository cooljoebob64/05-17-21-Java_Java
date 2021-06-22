import java.util.Scanner;

public class AgeLimit {

	final static int DEFAULT_AGE_LIMIT = 21;
		
	public static void main(String[] args) {		
		
		Scanner input = new Scanner(System.in);	
		int ageLimit;	
		int userAge;
		
		// Get the age limit from the user
		System.out.println("Enter the age limit: ");
		try {
			ageLimit = Integer.parseInt(input.nextLine());
			System.out.println("Age limit set to " + ageLimit);
		} catch(NumberFormatException e) {
			ageLimit = DEFAULT_AGE_LIMIT;
			System.out.println("That's not an integer. Age limit set to " + ageLimit);
		}
		
		// Get the user's age from the user
		System.out.println("Enter your age: ");
		try {
			userAge = Integer.parseInt(input.nextLine());
			System.out.println("Your age is " + userAge);
		} catch (NumberFormatException e) {
			userAge = 0;
			System.out.println("That's not an integer. User age set to " + userAge);
		}
		
		// Check if the user is old enough, and display a message for the result
		if(userAge>=ageLimit) {
			System.out.println("You are of age! Enjoy!");
		} else {
			System.out.println("You are UNDER age! Come back when you're older!");
		}
		
		
		System.out.println("End of program.");
		input.close();
	}
}
