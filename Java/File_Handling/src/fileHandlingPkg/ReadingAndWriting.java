package fileHandlingPkg;
import java.io.*;
import java.util.Scanner;
public class ReadingAndWriting {
	
	public static void main(String[] args) {
		System.out.printf("Enter file name to read : ");
		try(
			Scanner sc = new Scanner(System.in);
			FileReader rd = new FileReader(sc.next());
		){
			int x=0;
			do {
				x = rd.read();
				System.out.print((char) x);
			}while( x!= -1);
			
		}catch(FileNotFoundException e) {
			System.out.printf("Specified File not found");
		} catch(IOException e) {
			System.out.printf("Exception occured %s", e.getMessage());
		} 

	}

}
