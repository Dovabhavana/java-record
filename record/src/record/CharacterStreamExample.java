package record;
import java.io.*;
public class CharacterStreamExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		  File file = new File("C:\\Users\\BHAVANA\\Documents\\20BQ1A0552 SEMINAR REPORT JAVA MID1.docx\\two.txt");
	      FileReader reader = new FileReader(file);
	      char chars[] = new char[(int) file.length()];
	 
	      reader.read(chars);
	      File out = new File("C:\\\\Users\\\\BHAVANA\\\\Documents\\\\20BQ1A0552 SEMINAR REPORT JAVA MID1.docx\\one.txt");
	      FileWriter writer = new FileWriter(out);
	      writer.write(chars);
	     
	      System.out.println("Data successfully written in the specified file");
	      writer.close();
	      reader.close();
	     String s="2-cse-a: 2020-2024";
	      char c[]=new char[s.length()];
	      s.getChars(0, s.length(), c, 0);
	      BufferedReader br=new BufferedReader(new CharArrayReader(c));
	      int x;
	      while((x=br.read())>=0)
	    	  System.out.print((char)x);
	      BufferedWriter bw=new BufferedWriter(new FileWriter("C:\\\\Users\\\\BHAVANA\\\\Documents\\\\20BQ1A0552 SEMINAR REPORT JAVA MID1.docx\\one.txt"));
	      bw.write(s);
	      bw.close();
	      br.close();
	      
	      System.out.println();
	      String s1="VIVA VVIT 2021";
	      char c1[]=new char[s.length()];
	      s.getChars(0, s1.length(), c1, 0);
	      
	      CharArrayWriter cw=new CharArrayWriter();
	      cw.write(c1);
	      String s2=cw.toString();
	      System.out.println("Data in stream is:");
	      CharArrayReader cr=new CharArrayReader(c1);
	      int x1;
	      while((x1=cr.read())>=0)
	    	  System.out.print((char)x1);
	      cw.close();
	      cr.close();
	    	  
	      
	      
	      
	    		  
	   }
	}
	


