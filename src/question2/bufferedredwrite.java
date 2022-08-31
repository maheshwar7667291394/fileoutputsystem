package question2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class bufferedredwrite {
  public static void main(String[] args) {
	File file=new File("mahesh.txt");
	 try {
		FileWriter fr=new FileWriter(file);
		BufferedWriter bw=new BufferedWriter(fr);
		bw.write("mahesh kuamr");
		bw.newLine();
		bw.write("123");
		bw.newLine();
		bw.write("mahesh kluyamarj");
		bw.flush();
		bw.close();
		
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 
	 try {
		FileReader fr=new FileReader(file);
		BufferedReader br=new BufferedReader(fr);
		try {
			String line=br.readLine();
			 while(line!=null) {
//				
				 System.out.println(line);
				 line=br.readLine();
			 }
			br.close();
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	} catch (FileNotFoundException e) {
		
		e.printStackTrace();
	}
	 
	
	}
}
