package phase1;

import java.util.Scanner;

public class LockedMe {
	
	public static void main(String[] args) {
		System.out.println("************* Welcome to LockedMe application *************");
		System.out.println("Developed By: Pragnya Nagwar");
		generalFeatures();
		generalOperation();
	}
	
	public static void generalFeatures() {
		System.out.println("              ");
		System.out.println("Choose provided option to process further");
		System.out.println("1. Retrieve Files in ascending order");
		System.out.println("2. Business Level Operations");
		System.out.println("3. Exit");
		System.out.println("              ");
		}
	
	public static void generalOperation() {
		System.out.println("Enter your Choice: ");
		Scanner sc = new Scanner(System.in);
		try{
			int choice = sc.nextInt();
			if(choice == 1 || choice == 2 || choice==3 || choice==4 ){
				userOption(choice);
			}else{
				System.out.println("Given input is not valid. Please restart the application and enter valid input");
			}
		} catch(Exception e){
			System.out.println("Given input is not valid. Please restart the application and enter valid input");
			//e.printStackTrace();
		}
	}
	
	public static void userOption(int choice){
		switch(choice){
		
		case 1:   
			   GetFileList.getFileList();
			   generalOperation();
			   break;
		case 2: System.out.println("Select below options to interact");
				System.out.println("1. Add file");
				System.out.println("2. Delete file");
				System.out.println("3. Search for file");
				System.out.println("4. Navigate back to main page");
				System.out.println("________________");
				BusinessLevelOperation.fileOperations();
				break;
		case 3: System.out.println("*****Thank you for using LockedMe*****");
				break;
		}
	}

}
