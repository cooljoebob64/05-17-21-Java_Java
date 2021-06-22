import java.util.Scanner;

public class MadLib {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);		
		
		System.out.println("Enter a name:");
		String name = input.nextLine();

		System.out.println("Enter a noun:");
		String noun3 = input.nextLine();
		System.out.println("Enter a noun:");
		String noun1 = input.nextLine();
		System.out.println("Enter a noun:");
		String noun5 = input.nextLine();
		System.out.println("Enter a noun:");
		String noun4 = input.nextLine();
		System.out.println("Enter a noun:");
		String noun2 = input.nextLine();
		

		System.out.println("Enter a verb:");
		String verb2 = input.nextLine();
		System.out.println("Enter a verb:");
		String verb5 = input.nextLine();
		System.out.println("Enter a verb:");
		String verb4 = input.nextLine();
		System.out.println("Enter a verb:");
		String verb1 = input.nextLine();
		System.out.println("Enter a verb:");
		String verb3 = input.nextLine();
		
		System.out.printf("Once upon a time, there was a %s named %s. %s had a %s"
				+ " that was really useful if you wanted to %s something. You could %s"
				+ " with it too, but it was even better at %sing with %ss. If you were "
				+ "really lucky, sometimes you could even see a %s %s a %s."
				+ " Just don't ever try to %s with it!",noun1,name,name,
				noun2,verb1,verb2,verb3,noun3,noun4,verb4,noun5,verb5);
		
		
		input.close();
	}

}
