package record;

import java.io.*;
import java.util.*;

public class Fileattr {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter the name of the file:");
         File f1 = new File(sc.next());

    System.out.println(f1.getName());
    System.out.println(f1.exists()?"file exists":"file does not exist");
    System.out.println(f1.canWrite()?"file is writable":"file cannot be writtable");
    System.out.println(f1.canRead()?"file is readable":"file cannot be readable");
    System.out.println(f1.isFile()?"normalfile":"pipped file");
    System.out.println("the length is"+f1.length()+"bytes");
    sc.close();

}

}