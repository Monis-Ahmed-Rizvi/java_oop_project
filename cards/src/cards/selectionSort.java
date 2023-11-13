package cards;

import java.util.Arrays;

public class selectionSort {

	
	public static void main(String[] args)
	{
		int[] arr = {9,8,7,6,54,2,32,86,41}; 
		
		for(int i =0;i<arr.length;i++)
		{
			int low_index = i;
			for(int j = i+1;j<arr.length;j++)
			{
				if(arr[low_index] > arr[j])
				{
					low_index = j;
				}
			}
			
			int swap_temp = arr[low_index];
			arr[low_index] = arr[i];
			arr[i] = swap_temp;
		}
		
		
		System.out.println(Arrays.toString(arr));
	}
	
	
	
	
}
