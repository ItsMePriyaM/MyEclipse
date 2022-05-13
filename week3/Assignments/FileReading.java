package week3.Assignments;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileReading {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String str;
//Create a object for File
		File file=new File("C://Users/Hp/Desktop/LearningFileReading.txt");
		//BufferReader
		BufferedReader br=new BufferedReader(new FileReader(file));
		//Check whether the file is not empty
		while((str=br.readLine())!=null)
		{
			System.out.println(str);
		}
		//close the reader
		br.close();
		
		//Using FileReader
		
//		FileReader reader=new FileReader("C://Users/Hp/Desktop/LearningFileReading.txt");
//		int i = reader.read();
//		while(i!=-1)
//		{
//			System.out.println((char)i);
//		}
//			reader.close();
//			System.out.println("");
//		
		//using Scanner
		Scanner sc=new Scanner(file);
		
		while(sc.hasNextLine())
		{
			System.out.println(sc.nextLine());
		}
		sc.close();
	}

}
