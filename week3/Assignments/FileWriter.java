package week3.Assignments;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileWriter {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
String fileName="C://Users/Hp/Desktop/LearningFileWriter.txt";
//using FileWriter
java.io.FileWriter writer=new java.io.FileWriter(fileName, true);
writer.write("TestLeaf Software");
writer.write("\r\n");//write new line
writer.write("I am learning writer");
writer.close();

//Using File output stream
String fileName2="C://Users/Hp/Desktop/LearningFileWriter2.txt";
FileOutputStream writerobj=new FileOutputStream(fileName2);
writerobj.write("I am lakshmi".getBytes());
writerobj.write("\r\n".getBytes());
writerobj.write("Learning Automation".getBytes());

	}

}
