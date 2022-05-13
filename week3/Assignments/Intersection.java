package week3.Assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Intersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int[] arr1= {3,2,11,4,6,7};
 int[] arr2= {1,2,8,4,9,7};
 
 List<Integer> intersectList=new ArrayList<Integer>();
 
 for(int i=0;i<arr1.length;i++)
 {
	 for(int j=0;j<arr2.length;j++)
	 {
		 if(arr1[i]==arr2[j])
		 {
			 intersectList.add(arr2[j]);
		 }
	 }
 }
 Collections.sort(intersectList);
 System.out.println(intersectList);
 
 List<Integer> firstList=new ArrayList<Integer>();
 List<Integer> secondList=new ArrayList<Integer>();
 
 for(int i=0;i<arr1.length;i++)
 {
	 firstList.add(arr1[i]);
 }
 for(int j=0;j<arr2.length;j++)
 {
	 secondList.add(arr2[j]);
 }
 firstList.retainAll(secondList);
 System.out.println(firstList);
 System.out.println(secondList);
	}

}
