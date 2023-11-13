package cards;

import java.util.*;
import java.lang.*;

public class Lop {

	public static void main(String[] args)
	{
		
		// some function that are no longer needed 
		// but can be used for debugging 
		
		
		
		int[] arr = new int[5];
		int x = 1;
		for(int i =0;i<4;i++)
		{
			arr[i] = x;
			x++;
		}
		
		//System.out.println(Arrays.toString(arr));
		
		
		// random number generation 
		
		Random rand = new Random();
		int n = arr.length;
		for(int i =0;i<n;i++)
		{
			int intrand = i + rand.nextInt(n - i);
			System.out.println(intrand);
		}
		
		System.out.println("");
		
		for(int i =0;i<n;i++)
		{
			int inrand =  rand.nextInt(n);
			System.out.println(inrand);
		}
		
		
		/*
		
		// you in put the rnadom array genrated by the randon function
		// returns a array with count of numbers in the rand array 
		int[] isCopy(int[] rand)
		{
			// create hash array or the given array 
		   int[] arr = new int[52];
		   for(int i=0;i<rand.length;i++)
		   {
			   int index = rand[i];
			   arr[index]++;
		   }	   
		   return arr;
		}

		
		// takes the array with count of numbers in the rand array 
		// genrates a new array with out the duplicates 
		int[] recon(int[] hash_arr)
		{
			// takes hash array removes duplicates 
			// generates new array  
			int act_count =0 ;
			for(int i=0;i<hash_arr.length;i++)
			{
				if(hash_arr[i]>0)
				{
					act_count++;
				}
			}
			
			System.out.println(act_count);
			// create an array count_active 
			
			int[] count_active = new int[act_count];
			int count = 0;
			for(int j =0;j<hash_arr.length;j++)
			{
				int x = hash_arr[j];
				if(x>0)
				{
					count_active[count++] = j;
					
				}
			}
			
			
			// if the hash array value is >0
			// append the number in the new array
			
			return count_active;
		}
		
		void randon()
		{
			// generate 52 random numbers 
			int[] arr = new int[52];
			Random rand = new Random();
			int n = cards.length;
			for(int i =0;i<n;i++)
			{
				
				int random = i + rand.nextInt(n-i);
				int result = i+(n-i);
				arr[i] = random;
				
			}
			
			// the generated array contains duplicated  number
			// function create histogram array 
			int[] res = isCopy(arr);
			 
			// removes duplicate number for random generated array
			int[] non_dup = recon(res);
			//System.out.println(Arrays.toString(non_dup));
			
			
		}
		
		*/
		
	}
}
