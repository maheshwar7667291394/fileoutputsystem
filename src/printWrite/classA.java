package printWrite;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class classA {
	public static void main(String[] args) throws IOException {
		File file=new File("d://hfjhd.txt");
		try {
			PrintWriter pr=new PrintWriter(file);
			pr.println("mahesh");

			pr.println(100);
			
			pr.println(100);

			pr.println(100);

			pr.println(100);
	
			
			pr.println("ramukak");

			pr.println(80);

			pr.println(80);

			pr.println(80);

			pr.println(80);
			
			pr.flush();
			pr.close();
			
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		
		 FileReader fr=new FileReader(file);
		 BufferedReader br=new BufferedReader(fr);
		 
		 for(int i=0;i<2;i++) {
			 String name=br.readLine();
			 int sum=0;
			 for(int j=0;j<4;j++) {
				 String x=br.readLine();
				 int n=Integer.parseInt(x);
				 sum+=n;
				 
			 }
			 System.out.println(name+" "+"total maekrs="+sum+" "+"Average="+sum/4);
			
		 }
		 
		  
		
	}
}
