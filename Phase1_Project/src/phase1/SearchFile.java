package phase1;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SearchFile {
	public static void searchForFile(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter file name to be searched: ");  
		String fileName = sc.nextLine();
		
		File f= new File("path" + fileName + ".txt");    
		if (f.exists()) {
			System.out.println(f.getName() + " Exists");
		} else {
			System.out.println(f.getName() + " Does not Exists");
		}
		
	}

}
