package Week3.day2.assignments;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;


public class RemoveDuplicates {
	/*
	 * Pseudo code 
	 
	 * a) Use the declared String text as input
		String text = "We learn java basics as part of java sessions in java week1";		
	 * b) Initialize an integer variable as count	  
	 * c) Split the String into array and iterate over it 
	 * d) Initialize another loop to check whether the word is there in the array
	 * e) if it is available then increase and count by 1. 
	 * f) if the count > 1 then replace the word as "" 
	 
	 * g) Displaying the String without duplicate words	
	 */
	public static void main(String[] args) {
	// a) Use the declared String text as input
	String text = "We learn java basics as part of java sessions in java week1";
	// b) Initialize an integer variable as count
	int count=0;
	//Split the String into array and iterate over it 

	String[] textarray=text.split(" ");
	//Split the String into array and iterate over it
	List<String> list1 = new ArrayList<String>();
      for(String s : textarray)
      {
    	  list1.add(s);
      }
	System.out.println(list1);
	
	for(int i=0;i<list1.size();i++)
	{
		for(int j=i+1;j<list1.size();j++)
		{
			
			if(list1.get(i).equals(list1.get(j)))
			{
				//if it is available then increase and count by 1. 
				count=count+1;
				
				//if the count > 1 then replace the word as "" 
				if(count>0)
				{
					list1.set(j, "");
				}
			}
			
		}
	}
	
System.out.println(list1);
	}
	

}

