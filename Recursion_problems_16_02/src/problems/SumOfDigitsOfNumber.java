package problems;

public class SumOfDigitsOfNumber
{

	public static void main(String[] args) 
	{
		int n = 12;
		System.out.println(n + " = " + sumOfDigitsOfN(n));
		
	}

	public static int sumOfDigitsOfN(int n) //12 -> 1(12/10) + 2(12 % 10)
	{
		int lenght = String.format("%d", n).length();
		
		if (lenght == 1)
			return n;
		
		return n%10 + sumOfDigitsOfN(n/10);
	}
}
