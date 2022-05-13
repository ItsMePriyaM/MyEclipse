package week3.Assignments;

import java.util.Arrays;
import java.util.Collections;

public class MaximumMinimum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Type 1
		Integer[] array = {1, 45, 77, 88, 33, 23, 4};
		
		Integer max = Collections.max(Arrays.asList(array));
		Integer min = Collections.min(Arrays.asList(array));
		
		System.out.println(max);
		System.out.println(min);
		
		//Type 2
		
		Arrays.sort(array);
	System.out.println("using sort array "+array[0]);
	System.out.println("using sort array "+array[array.length-1]);
	
	//Type 3 - using for loop
	int smallnum=array[0];
	int largenum=array[0];
	for(int i=0;i<array.length;i++)
	{
		if(array[i]>largenum)
		{
			largenum=array[i];
		}
		else if(array[i]<smallnum)
		{
			smallnum=array[i];
		}
	}
	System.out.println("Using for loop:"+smallnum);
	System.out.println("Using for loop:"+largenum);
	}
	
	
}
