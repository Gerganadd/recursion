package problems;

public class TheSmallestElementContains6Or8 {

	public static void main(String[] args) {
		int[] arr = {12 , 40, -16, 32, 0, 23, 24, 65, -1, 39 };
		int[] arr1 = {1, 2, 3};
	
		int minValue = min(arr1, 0);
		
		if(isValid(minValue))
		{
			System.out.println(minValue);
		}
		else
		{
			System.out.println("NO");
		}
	}

	public static int min(int[] arr, int index)
	{
		if (index == arr.length - 1)
		{
			return arr[index];
		}
		
		int m = min(arr, index + 1);
		
		if (arr[index] < m && isValid(arr[index]))
		{
			return arr[index];
		}
		return m;
	}
	
	public static boolean isValid(int number)
	{
		number = Math.abs(number);
		
		if (number == 0)
		{
			return false;
		}
		
		int digit = number % 10;
		
		if (digit == 6 || digit == 8)
		{
			return true;
		}
		return isValid(number / 10);
	}
}
