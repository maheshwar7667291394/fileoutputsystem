package practicefilesystem;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ClassA {
public static void main(String[] args) {
	File file=new File("mahesh.txt");
	 try {
		FileWriter fw=new FileWriter(file);
		fw.write("mahesh kumar sahni");
		fw.flush();
		fw.close();
	} catch (IOException e) {
		
		e.printStackTrace();
	}
	 try {
		FileReader fr=new FileReader(file);
		 try {
			int i=fr.read();
			char c=(char)i;
			 while(i!=-1) {
				 System.out.println(c);
				 i=fr.read();
				 c=(char)i;
			 }
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	} catch (FileNotFoundException e) {
	     
		e.printStackTrace();
	}
}
}
