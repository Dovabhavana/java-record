package record;
import java.io.*;
import java.util.*;
public class FileDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter file name:");
File f1=new File(sc.next());
System.out.println(f1.getName());
System.out.println(f1.exists()?"File exists":"File does not exists");
System.out.println(f1.canWrite()?"file can be writtenable":"File cannot be writtenable");
System.out.println(f1.canRead()?"File is readable":"File can not be readable");
System.out.println(f1.isFile()?"Normal file":"piped file");
System.out.println("the length of file is"+f1.length()+"Bytes");
sc.close();
	}

}
