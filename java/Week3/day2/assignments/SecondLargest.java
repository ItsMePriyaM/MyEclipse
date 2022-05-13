package Week3.day2.assignments;

import java.util.Set;
import java.util.TreeSet;

public class SecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data = {3,2,11,4,6,7};
		Set<Integer> setdata=new TreeSet<Integer>();
		for(int i : data)
		{
			setdata.add(i);
		}
		System.out.println(setdata);
		for(int i2:setdata)
		{
			System.out.println("The second Largest number is : "+setdata(i2));
		}
	}

}
