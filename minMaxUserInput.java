import java.util.Scanner;

public class minMaxUserInput
{
	public static void main(String[] args)
	{
		Scanner minMaxScanner = new Scanner(System.in);

		int min = 0;
		int max = 0;
		boolean first = true;

		while (true)
		{
			System.out.println("Enter number: ");
			boolean isAnInt = minMaxScanner.hasNextInt();

			if (isAnInt)
			{
				int number = minMaxScanner.nextInt();

				if(first)
				{
					first = false;
					min = number;
					max = number;
				}

				if(number > max)
				{
					max = number;
				}

				if(number < min)
				{
					min = number;
				}
			}
			else
			{
				break;
			}

			minMaxScanner.nextLine(); //handle input
		}
		
		System.out.println("min = " + min + ", max = " + max);
		minMaxScanner.close();

	}
}