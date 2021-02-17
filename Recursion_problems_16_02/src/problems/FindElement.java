package problems;

public class FindElement 
{

	public static void main(String[] args) 
	{
		int[] sortedArray = {1, 2, 3, 4, 12};
		System.out.println(isContains(sortedArray, 9));
	}

	private static int findMiddleIndex(int[] arr)
	{
		int middle = arr.length / 2;
		
		if (arr.length % 2 != 0)
			middle += 1;
		
		return middle;
	}
	
	public static boolean isContains(int[] arr, int element)
	{
		int middleElementIndex = findMiddleIndex(arr);
		int currentElementIndex = middleElementIndex - 1;

		if (element == arr[currentElementIndex])
			return true;
		
		if (element < arr[currentElementIndex])
		{
			int[] newArr = new int[currentElementIndex];
			System.arraycopy(arr, 0, newArr, 0, currentElementIndex);
			
			return isContains(newArr, element);
		}
		else if (element > arr[currentElementIndex])
		{
			int newLenght = arr.length - middleElementIndex;
			int[] newArr = new int[newLenght];
			System.arraycopy(arr, middleElementIndex, newArr, 0, newLenght); 
			
			return isContains(newArr, element);
		}
		
		return false;
	}
}
