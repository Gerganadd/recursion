package problems;

public class NOD 
{

	public static void main(String[] args) 
	{
		System.out.println("nod : " + nod(12, 40));
		int[] arr = {12 , 40, 16, 32};
		System.out.println("nod of arr : " + nodOfElementsInArray(arr, 0));
	}
	
	public static int nod(int firstN, int secondN) 
	{
		firstN = Math.abs(firstN);
		secondN = Math.abs(secondN);
		
		if (secondN == 0)
			return firstN;
		
		return nod(secondN, firstN % secondN);
	}
	
	//to do!!
	public static int nodOfElementsInArray(int[] arr, int lastIndex)
	{
		if (lastIndex == arr.length - 2)
		{
			int first = arr[arr.length - 2];
			int second = arr[arr.length - 1];
			int result = nod(first, second);
			return result;
		}
		
		int second = nodOfElementsInArray(arr, lastIndex + 1);
		int result = nod(arr[lastIndex], second);
		return result;
	}

}
