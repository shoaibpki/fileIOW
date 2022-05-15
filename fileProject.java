package fileCRW;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class fileProject {
    private static void createFile() throws IOException
    {
          File file = new File("E://Files//testFile1.txt");
  
          //Create the file
          if (file.createNewFile()==true){
            System.out.println("File is created!");
          }else{
            System.out.println("File already exists.");
          }
           
          //Write Content
          FileWriter writer = new FileWriter(file);
          writer.write("Test data 14-05-22");
          writer.close();
          
          //Read file
          FileReader reader = new FileReader(file);
			int x = 0;
			while ((x=reader.read()) != -1) {
				System.out.print((char)x);
			}

    }

    public static void main(String[] args) {
		// TODO Auto-generated method stub
    	try {
			createFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

