package week1.Day2;

import java.util.Arrays;

public class SecondLargestInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data = {3,2,11,4,6,7};
		
			Arrays.sort(data);
			for(int i=0;i<data.length;i++)
			{
				System.out.println("The first element after sorting is :"+data[i]);
						
				
			}
			System.out.println("The Length of the array is :"+data.length);
			System.out.println("The Second largest Element is : "+data[data.length-2]);
	}

}
