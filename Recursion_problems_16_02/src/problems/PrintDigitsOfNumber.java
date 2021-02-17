package problems;

public class PrintDigitsOfNumber 
{

	public static void main(String[] args) 
	{
		int number = 123;
		System.out.println("Number : " + number);
		
		System.out.println("Starts from left :");
		printDigitsOfNStartsFromLeft(number);
		
		System.out.println("Starts from right :");
		printDigitsOfNStartsFromRight(number);
	}
	
	public static void printDigitsOfNStartsFromLeft(int n) 
	{
		n = Math.abs(n); // for negative input
		
		int lenght = String.format("%d", n).length();
		
		if (lenght == 1)
		{
			System.out.println(n);
			return;
		}
		
		int d = (int) Math.pow(10, lenght - 1); //may change the name of variable
		int currentDigit = n / d;
		
		System.out.println(currentDigit);
		
		printDigitsOfNStartsFromLeft(n % d); // 123 -> 123 % 100 = 23
	}
	
	public static void printDigitsOfNStartsFromRight(int n)
	{
		n = Math.abs(n); // for negative input
		
		int lenght = String.format("%d", n).length();
		
		if (lenght == 1)
		{
			System.out.println(n);
			return;
		}
		
		int currentDigit = n % 10;
		
		System.out.println(currentDigit);
		
		printDigitsOfNStartsFromRight(n / 10);
	}

}
