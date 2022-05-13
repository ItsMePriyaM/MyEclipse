
package week3.Assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.apache.poi.util.SystemOutLogger;

public class MissingElementsArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5,9,6,8};
		Arrays.sort(arr);
		
			int n = arr.length +1;// 8+1=9
			int sum = n*(n+1)/2;//sum=9*(9+1)/2==> 45
			for(int i=0;i<arr.length;i++) {
				sum = sum - arr[i];
				//Sum=45-1==>44
				//Sum=44-2==>42
				//Sum=42-3==>39
				//Sum=39-4==>35
				//Sum=35-5==>30
				//Sum=30-6==>24
				//Sum=24-8==>16
				//Sum=16-9==>7
				
			}
	        System.out.println("Missing Number is "+ sum);
	          

	// using Set
	        int[] arr1 = {2,3,4,5,9,6,8};       
	Set<Integer> newset=new TreeSet<Integer>();
	for(int i=0;i<arr1.length;i++)
	{
		newset.add(arr1[i]);
	}
	System.out.println(newset);
	List<Integer> list1=new ArrayList<Integer>(newset);
	for(int i=2;i<list1.size();i++)
	{
		if(i!=list1.get(i-2))
			//2!=2(index(2-2) 2
			//3!=3(index 3-2) 3
			//4!=4(index 4-2) 4
			//5!=5(index 5-2) 5
			//6!=6(index 6-2) 6
			//7!=8(index 7-2) 8
		{
			System.out.println("The missing element is :"+i);
			break;
		}
	}
}	 

}
