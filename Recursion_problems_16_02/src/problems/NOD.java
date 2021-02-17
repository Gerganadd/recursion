package problems;

public class NOD 
{

	public static void main(String[] args) 
	{
		System.out.println(nod(12, 40));
		int[] arr = {12 , 40, 16, 32};
		System.out.println(nodOfElementsInArray(arr, 3));
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
		if (lastIndex == 1)
			return nod(arr[0], arr[1]);
		
		return nod(arr[lastIndex], arr[lastIndex - 1]);
		//if ()
	}

}
