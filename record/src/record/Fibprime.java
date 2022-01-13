package record;

import java.io.IOException;
public class Fibprime {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		 fibonacci fi=new fibonacci(); 
		  prime pri=new prime(); 
		  receiver r=new receiver(fi,pri); 
		  fi.start(); 
		  pri.start(); 
		  r.start(); 
	}

}
