package fileHandlingPkg;

import java.io.FileReader;
import java.io.IOException;

public class ReaderClass {

	public static void main(String[] args) {
		try (FileReader rd = new FileReader("kal-ho=naa-ho.txt")){
			int read = 0;
			do {
				read = rd.read();
				System.out.print((char)read);
			} while(read != -1);
		}
		catch(IOException e) {
			System.out.printf("Exception occured %s", e.getMessage());
		}
	}
}
