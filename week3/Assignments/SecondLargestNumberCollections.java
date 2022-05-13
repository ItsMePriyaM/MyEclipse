
package week3.Assignments;

import java.util.ArrayList;
import java.util.List;

import java.util.Set;
import java.util.TreeSet;

public class SecondLargestNumberCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data = {3,2,11,4,6,7};
Set<Integer> inputset=new TreeSet<Integer>();

for(Integer i:data)
{
	inputset.add(i);
}
System.out.println(inputset);

List<Integer> list=new ArrayList<Integer>(inputset);

System.out.println("The Second Largest number in the given input is "+list.get(list.size()-2));

//using array

int n=inputset.size();//get the set size
int arr[]=new int[n];// initialise array for a size of set
int i=0;
for(int e : inputset)
{
	arr[i++]=e;//add the set elements to the array
}
System.out.println("The Second Largest number in the given input is "+arr[arr.length-2]);

//Using to array method
Object[] array=inputset.toArray();
System.out.println("The Second largest number is : "+array[array.length-2]);

 	}

}
