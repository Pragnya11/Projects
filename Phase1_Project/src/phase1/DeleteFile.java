package phase1;

import java.io.File;
import java.util.Scanner;

public class DeleteFile {
	public static void deleteFile(){
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter file name to be deleted: ");  
			String fileName = sc.nextLine();
			File f= new File("path" + fileName + ".txt");   
			if(f.delete()) {  
				System.out.println(f.getName() + " deleted");  
			}else{  
				System.out.println("Failed to delete!! File does not exist to delete.");  
			} 
		}catch(Exception e){  
			e.printStackTrace();  
		}  
		  
	}
}
