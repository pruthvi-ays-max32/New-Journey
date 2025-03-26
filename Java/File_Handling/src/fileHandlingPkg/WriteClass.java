package fileHandlingPkg;

import java.io.FileWriter;
import java.io.IOException;

public class WriteClass {

	public static void main(String[] args) {
		try (FileWriter fw = new FileWriter("kal-ho=naa-ho.txt")){
			fw.write("Har pal yahaan ji bhar jiyo jo hai sama kal ho na ho.");
			fw.flush();
			fw.write("Ek khushi aur palo");
			System.out.println("Successfully Return.");
		}
		catch(IOException e) {
			System.out.printf("Exception occured %s", e.getMessage());
		}
	}
}
