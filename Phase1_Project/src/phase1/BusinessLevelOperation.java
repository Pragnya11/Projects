package phase1;

import java.util.Scanner;

public class BusinessLevelOperation {
	
	public static void fileOperations(){
	try{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your input: ");
		int optSelected = sc.nextInt();
		switch (optSelected) {
		case 1: AddFile.addOperation();
			    fileOperations();
		        break;
			
		case 2: DeleteFile.deleteFile();
			    fileOperations();
		        break;
			
		case 3: SearchFile.searchForFile();
			    fileOperations();
			    break;

		case 4: System.out.println("Navigate back to main context");
				LockedMe.generalFeatures();
				LockedMe.generalOperation();
				break;
			
		default: fileOperations();
			     break;
			
		}
		
	} catch(Exception e){
		System.out.println("Given input is not valid. Please restart the application and enter valid input");
		//e.printStackTrace();
	}
	
}

}
