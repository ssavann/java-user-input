import java.util.Scanner;

public class userInput
{
	public static void main(String[] args)
	{
		Scanner myUserInput = new Scanner(System.in);
		
		System.out.println("Enter your name: ");
		
		String name = myUserInput.nextLine();

		System.out.println("Your name is " + name);

		//need to close the input
		myUserInput.close();

	}
}