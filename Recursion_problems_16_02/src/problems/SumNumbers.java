package problems;

public class SumNumbers 
{

	public static void main(String[] args) 
	{
		System.out.println(sumFromZeroToN(5));
	}

	public static int sumFromZeroToN(int n) // only for positive numbers
	{
		if (n == 0)
			return 0;
		
		return n + sumFromZeroToN(n - 1);
	}
}
