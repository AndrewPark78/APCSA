package unit13;
import static java.lang.System.*;
import java.util.Arrays;		//use Arrays.toString() to help print out the array

public class QuickSort
{
	private static int passCount;

	public static void quickSort(Comparable[] list)
	{
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < list.length; i++) {
			if((int) list[i] > max){
				max = (int) list[i];
			}
			if((int) list[i] < min){
				min = (int) list[i];
			}
		}
		quickSort(list, min, max);
	
	}


	private static void quickSort(Comparable[] list, int low, int high)
	{
		System.out.println("Starting Sort");
		int split = 0;
		while(low < high){
			passCount++;
			System.out.println("Passes: " + passCount + ": " + list);
			split = partition(list, low, high);
			quickSort(list, low, split);
			quickSort(list, split+1, high);
		}
	}


	private static int partition(Comparable[] list, int low, int high)
	{
		System.out.println("Starting Partition");
		int pivot = (int) list[0];
		int bot = low-1;
		int top = high+1;
		while(bot<top){
			while(bot+1 < pivot){
				while(top-1 > pivot){
					if(bot > top || bot == top){
						return top;
					}
				
				}
			}
			int temp = top;
			top = bot;
			bot = temp;
		}
		
		return 0;
	}
}