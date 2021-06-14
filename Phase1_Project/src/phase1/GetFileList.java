package phase1;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GetFileList {
public static void getFileList(){
		
		try{
			List<String> results = new ArrayList<String>();
			//File[] files = new File("C://SimpliLearn/Files").listFiles();
			File[] files = new File("path").listFiles();
			
			for (File file : files) {
			    if (file.isFile()) {
			        results.add(file.getName());
			    }
			}
			System.out.println("No. of files + " + results.size());
			Collections.sort(results);
			for(String file : results){
				System.out.println(file);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}

}
