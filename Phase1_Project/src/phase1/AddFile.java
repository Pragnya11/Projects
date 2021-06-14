package phase1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class AddFile {
	public static void addOperation(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter File name");
		String fileName = sc.nextLine();
		
		try(FileOutputStream file = new FileOutputStream("path" + fileName + ".txt")) {
			String str = "This is newly created file";
			byte[] b = str.getBytes();
			file.write(b);
			System.out.println("file " + fileName + " added successfully");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
