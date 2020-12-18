public class parsingString
{
	public static void main(String[] args)
	{
		
		//trying to convert caracters or text into a number
		String numberString = "2020";
		System.out.println("number as string = " + numberString);

		int number =  Integer.parseInt(numberString);
		System.out.println("number = " + number);

		numberString += 1;
		number += 1;

		System.out.println("number as string = " + numberString);
		System.out.println("number = " + number);


	}


}