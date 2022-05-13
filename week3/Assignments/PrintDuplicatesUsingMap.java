package week3.Assignments;

import java.util.Map;
import java.util.Map.Entry;

import org.apache.commons.collections4.map.HashedMap;

import com.google.common.collect.Maps;

public class PrintDuplicatesUsingMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data= {1,3,8,3,11,5,6,4,7,6,7};
		//Initialise a Map
		Map<Integer,Integer> duplicates=new HashedMap<Integer, Integer>();
		for(int i=0;i<data.length-1;i++)
		{
			if(duplicates.containsKey(data[i]))
			{
				duplicates.put(data[i], duplicates.get(data[i])+1);
			}
			else
			{
				duplicates.put(data[i], 1);
			}
		}
		for(Entry<Integer, Integer> eachEntry : duplicates.entrySet())
		{
			if(eachEntry.getValue() > 1) {
				System.out.println(eachEntry.getKey());
			}
		}
	}

}
