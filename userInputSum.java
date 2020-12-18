import java.util.Scanner;

public class userInputSum
{
	public static void main(String[] args)
	{
		Scanner userScanner =  new Scanner(System.in);

		int counter = 0;
		int sum = 0;


		while(true)
		{
			int order = counter + 1;
			System.out.println("Enter number #" + order + ":");

			boolean isAnInt = userScanner.hasNextInt();

			if(isAnInt)
			{
				int number = userScanner.nextInt();
				counter++;
				sum += number;
				if (counter == 10)
				{
					break;
				}
			}
			else
			{
				System.out.println("Invalid number");
			}

			userScanner.nextLine();	//handle end of line (enter key)


		}

		System.out.println("sum = " + sum);


		userScanner.close();
		
	}


}