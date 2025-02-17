package exceptionHandling;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class CheckedException {

	public static void main(String[] args) {
		try{
			PrintWriter pw = new PrintWriter("abc.txt");
			pw.print("Hello");
			pw.close(); 
			System.out.println("File Found");
		}catch(FileNotFoundException e){
			System.out.println("File Not Found");
			e.printStackTrace();
		}
		
		try{
			
			System.out.println(10/0);
		}catch(Exception e){
			System.out.println("Catch block execution");
			e.printStackTrace();
		}
		
		System.out.println("After try catch");

	}

}
