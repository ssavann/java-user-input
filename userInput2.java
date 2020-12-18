import java.util.Scanner;

public class userInput2
{
	public static void main(String[] args)
	{
		Scanner myUserInput = new Scanner(System.in);
		
		System.out.println("Enter your year of birth:");
		int yearOfBirth = myUserInput.nextInt();
		myUserInput.nextLine();	//handle next line character (enter key)

		System.out.println("Enter your name: ");
		String name = myUserInput.nextLine();

		int age = 2020 - yearOfBirth;

		
		if (age >= 0 && age <= 100)
		{
		System.out.println("Your name is " + name + ", and you are " + age + " years old.");
		}
		else
		{
			System.out.println("Invalid year of birth");
		}

		//need to close the input
		myUserInput.close();

	}
}