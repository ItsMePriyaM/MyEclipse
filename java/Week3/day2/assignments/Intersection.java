package Week3.day2.assignments;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Intersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// Declare An array for {3,2,11,4,6,7};	
		Set<Integer> set1=new TreeSet<Integer>();
	set1.add(3);
	set1.add(2);
	set1.add(11);
	set1.add(4);
	set1.add(6);
	set1.add(7);
	System.out.println(set1);
	//Declare another array for {1,2,8,4,9,7};
	Set<Integer> set2=new TreeSet<Integer>();
	set2.add(1);
	set2.add(2);
	set2.add(8);
	set2.add(4);
	set2.add(9);
	set2.add(7);
	System.out.println(set2);
	
	//Common set
	Set<Integer> common=new TreeSet<Integer>();
	
	//c) Declare for loop iterator from 0 to array length
	for(int i1 : set1)
	{
		// * d) Declare a nested for another array from 0 to array length
		for(int i2 : set2)
		{
		//e) Compare Both the arrays using a condition statement
			if(i2==i1)
			{
				common.add(i1);
				
			}
		}
	}
	System.out.println(" The intersected Elements are : "+common);
	}

}
