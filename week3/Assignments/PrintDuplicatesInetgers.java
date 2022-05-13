package week3.Assignments;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class PrintDuplicatesInetgers {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		Set<Integer> uniqueset=new LinkedHashSet<Integer>();
		List<Integer> duplist=new ArrayList<Integer>();
	
		for(int i=0;i<arr.length;i++)
		{
			if(!(uniqueset.add(arr[i])))
			{
				duplist.add(arr[i]);
				
			}
			else
			{
				uniqueset.add(arr[i]);
			}
		}
		System.out.println("The array without duplicates is :"+uniqueset);
		System.out.println("The Duplicate numbers in array are :"+duplist);
		
	}

}
