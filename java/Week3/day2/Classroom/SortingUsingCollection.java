package Week3.day2.Classroom;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;

public class SortingUsingCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Declare a String array and add the Strings values as (HCL, Wipro,  Aspire Systems, CTS)	
		String[] input = {"HCL","Wipro","Aspire Systems","CTS"};
//		Declare a String array and add the Strings values as (HCL, Wipro,  Aspire Systems, CTS)	
		ArrayList<String> array =new ArrayList<String>();
		for(String s :input)
		{
			array.add(s);
			//System.out.println(array);
		}

//		get the length of the array		
         int length=array.size();
         System.out.println(length);
         
//		sort the array
         Collections.sort(array);

//		Iterate it in the reverse order
         Collections.reverse(array);

//		print the array
		System.out.println(array);
//		Required Output: Wipro, HCL , CTS, Aspire Systems
	}

}
