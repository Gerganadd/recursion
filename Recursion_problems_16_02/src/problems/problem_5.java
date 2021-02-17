package problems;

public class problem_5 
{
	public static final int a = 10; 
	public static void main(String[] args) 
	{
		printN(5);
	}

	public static void printN(int n)
	{
		printByÀscending(n, 1);
		printByDescending(n); 
	}
	
	private static void printByDescending(int n)
	{
		if (n == 1)
		{
			System.out.print(10);
			return;
		}
		
		System.out.print(((int) Math.pow(a, n)) + " "); 
		printByDescending(n - 1);
	}
	
	private static void printByÀscending(int target, int currentN)
	{
		if (currentN > target)
		{
			return;
		}
		
		System.out.print((int) Math.pow(a, currentN)+ " "); 
		printByÀscending(target, currentN + 1);
	}
}
